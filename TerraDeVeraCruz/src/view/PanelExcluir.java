package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelExcluir {

	private JPanel panel;
	private JTextField txtQas;
	private JButton btnExcluirItem;
	
	public JButton getExcluirItem() {
		return btnExcluirItem;
	}

	public void setExcluirItem(JButton btnExcluirItem) {
		this.btnExcluirItem = btnExcluirItem;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getTextField() {
		return txtQas;
	}

	public void setTextField(JTextField textField) {
		this.txtQas = textField;
	}
	
	public PanelExcluir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		panel = new JPanel();
		panel.setBounds(0, 0, 300, 100);
		panel.setLayout(null);
		
		txtQas = new JTextField();
		txtQas.setToolTipText("");
		txtQas.setBounds(124, 11, 166, 20);
		panel.add(txtQas);
		txtQas.setColumns(10);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setBounds(10, 14, 46, 14);
		panel.add(lblId);
		
		btnExcluirItem = new JButton("Excluir Item");
		btnExcluirItem.setBounds(10, 70, 99, 23);
		panel.add(btnExcluirItem);

	}

}
