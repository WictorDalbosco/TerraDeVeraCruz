package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.hibernate.Session;

import DAO.ItemDAO;
import DAO.SlotDAO;
import access.HibernateAcesso;
import view.PanelExcluir;

public class PanelExcluirController {
	private PanelExcluir pe;
	private Session session = HibernateAcesso.getSessionFactory().openSession();
	private SlotDAO dao = SlotDAO.getInstance(session);
	
	public PanelExcluirController(PanelExcluir pe) {
		this.pe = pe;
	}
	
	public void inicializaController() {
		this.pe.getExcluirItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(pe.getTextField().getText());
				dao.removeById(id);
			}
		});
		
	}
}
