package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.hibernate.Session;

import DAO.ItemDAO;
import access.HibernateAcesso;
import view.PanelExcluir;
import view.PanelExcluirItem;

public class PanelExcluirItemController {
	private PanelExcluirItem pei;
	private Session session = HibernateAcesso.getSessionFactory().openSession();
	private ItemDAO dao = ItemDAO.getInstance(session);
	
	public PanelExcluirItemController(PanelExcluirItem pei) {
		this.pei = pei;
	}
	
	public void inicializaController() {
		this.pei.getExcluirItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = (pei.getTextField().getText());
				System.out.println(nome);
				dao.removeByNome(nome);
			}
		});
		
	}
}
