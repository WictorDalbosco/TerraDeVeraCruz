package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;

public class TelaInventario {

	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Create the application.
	 */
	public TelaInventario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel = new JPanel();
		panel.setBounds(0, 0, 820, 410);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.desktop);
		panel_1.setBounds(187, 51, 408, 309);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(10, 11, 89, 89);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(109, 11, 89, 89);
		panel_1.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBackground(SystemColor.activeCaption);
		button_1.setBounds(208, 11, 89, 89);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBackground(SystemColor.activeCaption);
		button_2.setBounds(10, 111, 89, 89);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBackground(SystemColor.activeCaption);
		button_3.setBounds(109, 111, 89, 89);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBackground(SystemColor.activeCaption);
		button_4.setBounds(208, 111, 89, 89);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBackground(SystemColor.activeCaption);
		button_5.setBounds(10, 211, 89, 89);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBackground(SystemColor.activeCaption);
		button_6.setBounds(109, 211, 89, 89);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBackground(SystemColor.activeCaption);
		button_7.setBounds(208, 211, 89, 89);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setBackground(SystemColor.activeCaption);
		button_8.setBounds(307, 11, 89, 89);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setBackground(SystemColor.activeCaption);
		button_9.setBounds(307, 111, 89, 89);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setBackground(SystemColor.activeCaption);
		button_10.setBounds(307, 211, 89, 89);
		panel_1.add(button_10);
	}
	
	public JPanel getPanel() {
		return panel_1;
	}
}
