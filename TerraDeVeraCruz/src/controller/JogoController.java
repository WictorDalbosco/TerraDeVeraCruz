package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.hibernate.Session;

import DAO.SlotDAO;
import access.HibernateAcesso;
import model.Inventario;
import model.Slot;
import view.PanelInventario;
import view.PanelPause;
import view.TelaJogo;

public class JogoController {
	private TelaJogo jogo;
	private boolean addedInvent;
	private PanelInventario inventario;
	private PanelPause pause;
	private ArrayList<Slot> inventarioSlots;
	//private Usuario usuario;

	public JogoController(TelaJogo jogo){
		this.jogo = jogo;
		//this.usuario = usuario;
	}
	
	public void inicializaController() {
		jogo.getFrame().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				System.out.println(k.getKeyChar() + " - " + k.getKeyCode());
				if(k.getKeyCode() == KeyEvent.VK_E) {
					if(inventario != null) {
						//jogo.getFrame().remove(iventario.getPanel());
						jogo.removePanel(inventario.getPanel());
						inventario = null;
						//System.out.println("Entrou no delete");
					}else {
						Session session = HibernateAcesso.getSessionFactory().openSession();
						SlotDAO dao = SlotDAO.getInstance(session);
						Inventario inventarioBanco = new Inventario();
						inventarioBanco.setInventario((ArrayList<Slot>)dao.findAll());
						inventarioSlots = inventarioBanco.getInventario();
						
						inventario = new PanelInventario();
						jogo.addPanel(inventario.getPanel());
						InventarioController inventarioController = new InventarioController(inventarioSlots, inventario, jogo);
						inventarioController.inicializaController();
						jogo.getFrame().repaint();
						//System.out.println("Entrou no inserte");						
					}
					jogo.getFrame().repaint();
				}
				if(k.getKeyCode() == KeyEvent.VK_ESCAPE) {
					if(pause != null) {
						//jogo.getFrame().remove(iventario.getPanel());
						jogo.removePanel(pause.getPanel());
						pause = null;
						//System.out.println("Entrou no delete");
					}else {
						pause = new PanelPause();
						jogo.addPanel(pause.getPanel());
						PauseController pc = new PauseController(pause);
						pc.inicializaController();

						//System.out.println("Entrou no inserte");						
					}
					jogo.getFrame().repaint();
					
				}
			}
		});
	}
}