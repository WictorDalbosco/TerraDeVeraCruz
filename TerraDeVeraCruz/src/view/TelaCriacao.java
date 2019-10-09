package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Frame;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import model.Slot;

public class TelaCriacao {

	private JFrame frame;
	private JButton btnCriarButton, btnExcluirButton, btnAtualizarItem,btnAtualizar,btnCriarSlot,btnExcluirItem,btnAtualizarItem_1;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriacao window = new TelaCriacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCriacao() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 437, 581);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnCriarButton = new JButton("Criar Slot");
		btnCriarButton.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnCriarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCriarButton.setBounds(10, 39, 99, 23);
		panel.add(btnCriarButton);
		
		btnExcluirButton = new JButton("Excluir Slot");
		btnExcluirButton.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnExcluirButton.setBounds(10, 77, 99, 23);
		panel.add(btnExcluirButton);
		
		btnAtualizarItem = new JButton("Atualizar Slot");
		btnAtualizarItem.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAtualizarItem.setBounds(10, 111, 99, 23);
		panel.add(btnAtualizarItem);
		
		panel_1 = new JPanel();
		panel_1.setBounds(119, 39, 300, 95);
		panel.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(0, 1, 0, 10));
		JScrollPane scrollPane = new JScrollPane(panel_2);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(119, 145, 300, 205);
		panel.add(scrollPane);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAtualizar.setForeground(SystemColor.desktop);
		btnAtualizar.setBounds(10, 327, 99, 23);
		panel.add(btnAtualizar);
		
		JLabel lblNewLabel = new JLabel("Tela de cria\u00E7\u00E3o");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(119, 11, 300, 17);
		panel.add(lblNewLabel);
		
		btnCriarSlot = new JButton("Criar Item");
		btnCriarSlot.setBounds(10, 145, 89, 23);
		panel.add(btnCriarSlot);
		
		btnExcluirItem = new JButton("Excluir Item");
		btnExcluirItem.setBounds(10, 179, 89, 23);
		panel.add(btnExcluirItem);
		
		btnAtualizarItem_1 = new JButton("Atualizar Item");
		btnAtualizarItem_1.setBounds(10, 213, 89, 23);
		panel.add(btnAtualizarItem_1);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(119, 361, 300, 205);
		panel.add(scrollPane_1);
		
		
		//scrollPane.setViewportView(panel_2);
	}

	public JButton getBtnCriarSlot() {
		return btnCriarSlot;
	}

	public void setBtnCriarSlot(JButton btnCriarSlot) {
		this.btnCriarSlot = btnCriarSlot;
	}

	public JButton getBtnExcluirItem() {
		return btnExcluirItem;
	}

	public void setBtnExcluirItem(JButton btnExcluirItem) {
		this.btnExcluirItem = btnExcluirItem;
	}

	public JButton getBtnAtualizarItem_1() {
		return btnAtualizarItem_1;
	}

	public void setBtnAtualizarItem_1(JButton btnAtualizarItem_1) {
		this.btnAtualizarItem_1 = btnAtualizarItem_1;
	}

	public JButton getCriarButton() {
		return btnCriarButton;
	}

	public void setCriarButton(JButton btnCriarButton) {
		this.btnCriarButton = btnCriarButton;
	}

	public JButton getExcluirButton() {
		return btnExcluirButton;
	}

	public void setExcluirButton(JButton btnExcluirButton) {
		this.btnExcluirButton = btnExcluirButton;
	}

	public JButton getAtualizarItem() {
		return btnAtualizarItem;
	}
	
	public JButton getAtualizar() {
		return btnAtualizar;
	}

	public void setAtualizarItem(JButton btnAtualizarItem) {
		this.btnAtualizarItem = btnAtualizarItem;
	}
	
	public void addPanel(JPanel i) {
		panel_1.add(i);
	}
	
	public void addSlotPanel(JPanel i) {
		panel_2.add(i);
	}
	
	public void rmvSlotPanel(JPanel i) {
		panel_2.remove(i);
	}
	
	public void cleanScroll() {
		panel_2.removeAll();
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void removePanel(JPanel i) {
		panel_1.remove(i);
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
	public void clean() {
		panel_1.removeAll();
	}

	public void addSlot(Slot slot) {
		// TODO Auto-generated method stub
		
	}
}
