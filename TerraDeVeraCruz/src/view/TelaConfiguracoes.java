package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TelaConfiguracoes {

	private JFrame frame;
	private JButton btnConfiguracoes,btnHabilidades,btnAjuda,btnMapa,btnSair;
	
	public JFrame getFrame() {
		return frame;
	}

	public JButton getBtnVoltar() {
		//return btnVoltar;
		return null;
	}

	/**
	 * Create the application.
	 */
	public TelaConfiguracoes() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 1230, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnConfiguracoes = new JButton("Som");
		btnConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracoes.setFont(new Font("Century Gothic", Font.BOLD, 29));
		btnConfiguracoes.setBounds(342, 248, 240, 35);
		frame.getContentPane().add(btnConfiguracoes);
		
		btnHabilidades = new JButton("Brilho");
		btnHabilidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHabilidades.setFont(new Font("Century Gothic", Font.BOLD, 29));
		btnHabilidades.setBounds(602, 248, 240, 35);
		frame.getContentPane().add(btnHabilidades);
		
		btnAjuda = new JButton("Acessibilidade");
		btnAjuda.setFont(new Font("Century Gothic", Font.BOLD, 29));
		btnAjuda.setBounds(342, 310, 240, 35);
		frame.getContentPane().add(btnAjuda);
		
		btnMapa = new JButton("V\u00EDdeo");
		btnMapa.setFont(new Font("Century Gothic", Font.BOLD, 29));
		btnMapa.setBounds(602, 310, 240, 35);
		frame.getContentPane().add(btnMapa);
		
		btnSair = new JButton("Voltar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSair.setFont(new Font("Century Gothic", Font.BOLD, 29));
		btnSair.setBounds(342, 367, 500, 35);
		frame.getContentPane().add(btnSair);
	}

	public JButton getBtnConfiguracoes() {
		return btnConfiguracoes;
	}

	public void setBtnConfiguracoes(JButton btnConfiguracoes) {
		this.btnConfiguracoes = btnConfiguracoes;
	}

	public JButton getBtnHabilidades() {
		return btnHabilidades;
	}

	public void setBtnHabilidades(JButton btnHabilidades) {
		this.btnHabilidades = btnHabilidades;
	}

	public JButton getBtnAjuda() {
		return btnAjuda;
	}

	public void setBtnAjuda(JButton btnAjuda) {
		this.btnAjuda = btnAjuda;
	}

	public JButton getBtnMapa() {
		return btnMapa;
	}

	public void setBtnMapa(JButton btnMapa) {
		this.btnMapa = btnMapa;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public void setBtnSair(JButton btnSair) {
		this.btnSair = btnSair;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		//this.btnVoltar = btnVoltar;
	}
}
