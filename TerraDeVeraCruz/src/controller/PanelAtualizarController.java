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

public class PanelAtualizarController {
	private PanelAtualizar pa;
	private Session session = HibernateAcesso.getSessionFactory().openSession();
	private SlotDAO dao = SlotDAO.getInstance(session);
	private ItemDAO daoI = ItemDAO.getInstance(session);
	
	public PanelAtualizarController(PanelAtualizar pa) {
		this.pa = pa;
	}
	
	public void inicializaController() {
		this.pa.getCriarItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Item itemA = daoI.getByNome(pa.getTextField_1().getText());
				Slot slotAdd = new Slot(Integer.parseInt(pa.getTextField().getText()),itemA);
				dao.merge(slotAdd);
			}
		});
		
	}
}
