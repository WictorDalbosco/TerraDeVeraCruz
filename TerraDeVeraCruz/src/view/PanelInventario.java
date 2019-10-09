package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import DAO.ItemDAO;
import model.Inventario;
import model.Slot;

import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;

public class PanelInventario {

	private JPanel panel;
	private JPanel panel_1;
	private ItemDAO slot;
	
	
	private ArrayList<Slot> item = new ArrayList<Slot>();
	private ArrayList<JButton> slotBotoes = new ArrayList<JButton>();
	
	public PanelInventario() {
		initialize();
	}

	private void initialize() {
		panel = new JPanel();
		panel.setBounds(0, 0, 820, 410);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(187, 51, 408, 309);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//item = model.Principal.inventario;
		
		JButton slot0 = new SlotButton(null);
		slot0.setBounds(10, 11, 89, 89);

		JButton slot1 = new SlotButton(null);
		slot1.setBounds(109, 11, 89, 89);

		
		JButton slot4 = new SlotButton(null);
		slot4.setBounds(10, 111, 89, 89);

		
		JButton slot5 = new SlotButton(null);
		slot5.setBounds(109, 111, 89, 89);

		
		JButton slot6 = new SlotButton(null);
		slot6.setBounds(208, 111, 89, 89);

		
		JButton slot8 = new SlotButton(null);
		slot8.setBounds(10, 211, 89, 89);

		
		JButton slot9 = new SlotButton(null);
		slot9.setBounds(109, 211, 89, 89);

		
		JButton slot10 = new SlotButton(null);
		slot10.setBounds(208, 211, 89, 89);

		
		JButton slot3= new SlotButton(null);
		slot3.setBounds(307, 11, 89, 89);

		
		JButton slot7 = new SlotButton(null);
		slot7.setBounds(307, 111, 89, 89);

		
		JButton slot11 = new SlotButton(null);
		slot11.setBounds(307, 211, 89, 89);

		
		JButton slot2 = new SlotButton(null);
		slot2.setBounds(208, 11, 89, 89);

		slotBotoes.add(slot0);
		slotBotoes.add(slot1);
		slotBotoes.add(slot2);
		slotBotoes.add(slot3);
		slotBotoes.add(slot4);
		slotBotoes.add(slot5);
		slotBotoes.add(slot6);
		slotBotoes.add(slot7);
		slotBotoes.add(slot8);
		slotBotoes.add(slot9);
		slotBotoes.add(slot10);
		slotBotoes.add(slot11);
	}
	
	public JPanel getPanel() {
		return panel_1;
	}
	

	
	public void insereItem(ArrayList<Slot> slots) {
		for (int i = 0; i < slots.size(); i++) {
			slotBotoes.get(i).setText(slots.get(i).getItem());
		}
		for (int i = 0; i < 12; i++) {
			panel_1.add(slotBotoes.get(i));
		}
	}
}
