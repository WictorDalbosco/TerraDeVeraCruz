package view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class PanelSlot {

	private JPanel panel;
	private JLabel label,label_1;
	
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
	public PanelSlot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		panel = new JPanel();
		panel.setBounds(0, 0, 300, 115);
		panel.setPreferredSize(new Dimension(200, 100));
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblId.setForeground(Color.BLACK);
		lblId.setBounds(10, 14, 46, 14);
		panel.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNome.setBounds(10, 59, 46, 14);
		panel.add(lblNome);
		
		label = new JLabel("<<num>>");
		label.setFont(new Font("Algerian", Font.PLAIN, 14));
		label.setBounds(76, 14, 72, 14);
		panel.add(label);
		
		label_1 = new JLabel("<<NOME>>");
		label_1.setFont(new Font("Algerian", Font.PLAIN, 14));
		label_1.setBounds(74, 58, 102, 14);
		panel.add(label_1);

	}

}
