package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import org.hibernate.Session;

import DAO.ItemDAO;
import DAO.SlotDAO;
import access.HibernateAcesso;
import model.Inventario;
import model.Item;
import model.Slot;
import view.PanelAtualizar;
import view.PanelAtualizarItem;
import view.PanelCriar;
import view.PanelCriarItem;
import view.PanelExcluir;
import view.PanelExcluirItem;
import view.PanelSlot;
import view.TelaCriacao;


public class CriacaoController {
	private TelaCriacao tc;
	private Inventario inventario;
	private ArrayList<Slot> inventarioSlots;
	private ArrayList<Item> inventarioItens = new ArrayList();
	
	public CriacaoController (TelaCriacao tc, Inventario inventario){
		this.tc = tc;
		this.inventario = inventario;
	}
	
	public void inicializaController() {
		CriacaoController cc = this;
		Session session = HibernateAcesso.getSessionFactory().openSession();
		SlotDAO dao = SlotDAO.getInstance(session);
		Inventario inventarioBanco = new Inventario();
		inventarioBanco.setInventario((ArrayList<Slot>)dao.findAll());
		inventarioSlots = inventarioBanco.getInventario();
		
		Session session1 = HibernateAcesso.getSessionFactory().openSession();
		ItemDAO daoi = ItemDAO.getInstance(session1);
		inventarioItens = (ArrayList<Item>) daoi.findAll();
		inventarioSlots = inventarioBanco.getInventario();
		
		scrollPanelAtualizar();
		

		this.tc.getCriarButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelCriar pc = new PanelCriar();
				tc.clean();
				tc.addPanel(pc.getPanel());
				tc.getFrame().repaint();
				PanelCriarController pcc = new PanelCriarController(pc, cc);
				pcc.inicializaController();
				
				Session session = HibernateAcesso.getSessionFactory().openSession();
				SlotDAO dao = SlotDAO.getInstance(session);
				Slot slot = dao.getById(pcc.getLastItemSaved().getId());
				addSlotToScrollPane(slot);
				tc.getFrame().repaint();
			}
		});
		this.tc.getAtualizarItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelAtualizar pa = new PanelAtualizar();
				tc.clean();
				tc.addPanel(pa.getPanel());
				tc.getFrame().repaint();
				PanelAtualizarController pac = new PanelAtualizarController(pa);
				pac.inicializaController();
				tc.getFrame().repaint();
			}
		});
		this.tc.getExcluirButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelExcluir pe = new PanelExcluir();
				tc.clean();
				tc.addPanel(pe.getPanel());
				tc.getFrame().repaint();
				PanelExcluirController pec = new PanelExcluirController(pe);
				pec.inicializaController();
				tc.getFrame().repaint();
			}
		});
		this.tc.getBtnCriarSlot().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelCriarItem pc = new PanelCriarItem();
				tc.clean();
				tc.addPanel(pc.getPanel());
				tc.getFrame().repaint();
				PanelCriarItemController pcc = new PanelCriarItemController(pc);
				pcc.inicializaController();
				
				Session session = HibernateAcesso.getSessionFactory().openSession();
				SlotDAO dao = SlotDAO.getInstance(session);
				Slot slot = dao.getById(pcc.getLastItemSaved().getId());
				addSlotToScrollPane(slot);
				tc.getFrame().repaint();
			}
		});
		this.tc.getBtnAtualizarItem_1().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelAtualizarItem pa = new PanelAtualizarItem();
				tc.clean();
				tc.addPanel(pa.getPanel());
				tc.getFrame().repaint();
				PanelAtualizarItemController pac = new PanelAtualizarItemController(pa);
				pac.inicializaController();
				tc.getFrame().repaint();
			}
		});
		this.tc.getBtnExcluirItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelExcluirItem pe = new PanelExcluirItem();
				tc.clean();
				tc.addPanel(pe.getPanel());
				tc.getFrame().repaint();
				PanelExcluirItemController pec = new PanelExcluirItemController(pe);
				pec.inicializaController();
				tc.getFrame().repaint();
			}
		});
		this.tc.getAtualizar().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
//				PanelCriar pc = new PanelCriar();
//				
//				PanelCriarController pcc = new PanelCriarController(pc, cc);
//				pcc.inicializaController();
				scrollPanelAtualizar();
			}
		});
		
	}
	
	public void scrollPanelAtualizar() {
		tc.cleanScroll();
		
		for (int i = 0; i < inventarioSlots.size(); i++) {
			//criar vários Paineis de produtos
			PanelSlot panelS = new PanelSlot();
			PanelSlotController panelPController = new PanelSlotController(panelS, inventarioSlots.get(i));
			panelPController.inicializaController();
			tc.addSlotPanel(panelS.getPanel());
			System.out.println("entrei");
		}
			
	}
	
	
	
	public void addSlotToScrollPane(Slot slot) {
		PanelSlot panelS = new PanelSlot();
		PanelSlotController panelPController = new PanelSlotController(panelS, slot);
		panelPController.inicializaController();
		tc.addSlotPanel(panelS.getPanel());
	}
	
	
	
	
}
