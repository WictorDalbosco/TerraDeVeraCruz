package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import org.hibernate.Session;

import DAO.ItemDAO;
import DAO.SlotDAO;
import access.HibernateAcesso;
import model.Item;
import model.Slot;
import view.PanelCriar;

public class PanelCriarController {
	private PanelCriar pc;
	private Session session = HibernateAcesso.getSessionFactory().openSession();
	private SlotDAO dao = SlotDAO.getInstance(session);
	private Slot lastSlotSaved;
	private CriacaoController cc;
	private ItemDAO daoI = ItemDAO.getInstance(session);
	
	public PanelCriarController(PanelCriar pc, CriacaoController cc) {
		this.pc = pc;
		this.cc = cc;
	}
	
	public void inicializaController() {
		this.pc.getCriarItem().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Item itemA = daoI.getByNome(pc.getTextField_1().getText());
				Slot slotAdd = new Slot(Integer.parseInt(pc.getTextField().getText()),itemA);
				dao.save(slotAdd);
				//lastSlotSaved = slotAdd;
				cc.addSlotToScrollPane(slotAdd);
				SwingUtilities.getWindowAncestor((JButton)e.getSource()).repaint();
			}
		});
		
	}
	
	public Slot getLastItemSaved() {
		return lastSlotSaved;
	}
}
