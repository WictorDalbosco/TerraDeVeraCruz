package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAtualizarItem {

	private JPanel panel;
	private JTextField txtQas;
	private JTextField textField_1;
	private JButton btnCriarItem;
	
	public JButton getCriarItem() {
		return btnCriarItem;
	}

	public void setCriarItem(JButton btnCriarItem) {
		this.btnCriarItem = btnCriarItem;
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

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	
	public PanelAtualizarItem() {
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 42, 166, 20);
		panel.add(textField_1);
		
		JLabel lblId = new JLabel("Nome:");
		lblId.setBounds(10, 14, 46, 14);
		panel.add(lblId);
		
		JLabel lblNome = new JLabel("Descri\u00E7\u00E3o:");
		lblNome.setBounds(10, 45, 66, 14);
		panel.add(lblNome);
		
		btnCriarItem = new JButton("Atualizar Item");
		btnCriarItem.setBounds(10, 70, 99, 23);
		panel.add(btnCriarItem);

	}
}
