package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.hibernate.Session;

import DAO.ItemDAO;
import DAO.SlotDAO;
import access.HibernateAcesso;
import model.Item;
import model.Slot;
import view.PanelAtualizar;
import view.PanelAtualizarItem;

public class PanelAtualizarItemController {
	private PanelAtualizarItem pai;
	private Session session = HibernateAcesso.getSessionFactory().openSession();
	private ItemDAO dao = ItemDAO.getInstance(session);
	
	public PanelAtualizarItemController(PanelAtualizarItem pai) {
		this.pai = pai;
	}
	
	public void inicializaController() {
		this.pai.getCriarItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Item itemAdd = new Item(pai.getTextField().getText(),pai.getTextField_1().getText());
				dao.merge(itemAdd);
			}
		});
		
	}
}
