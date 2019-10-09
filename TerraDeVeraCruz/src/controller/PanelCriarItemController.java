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
	import view.PanelAtualizar;
import view.PanelCriarItem;


public class PanelCriarItemController {
	
		private PanelCriarItem pci;
		private Session session = HibernateAcesso.getSessionFactory().openSession();
		private ItemDAO dao = ItemDAO.getInstance(session);
		
		public PanelCriarItemController(PanelCriarItem pci) {
			this.pci = pci;
		}
		
		public void inicializaController() {
			this.pci.getCriarItem().addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					Item itemAdd = new Item(pci.getTextField().getText(),pci.getTextField_1().getText());
					dao.save(itemAdd);
					//lastSlotSaved = slotAdd;
//					cc.addSlotToScrollPane(temAdd);
//					SwingUtilities.getWindowAncestor((JButton)e.getSource()).repaint();
				}
			});
			
		}

		public Slot getLastItemSaved() {
			// TODO Auto-generated method stub
			return null;
		}
	}


