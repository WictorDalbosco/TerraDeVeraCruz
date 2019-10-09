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
import javax.swing.JPanel;
import java.awt.SystemColor;

public class PanelPause {

	private JPanel panel;
	private JButton btnVoltar,btnConfiguracoes,btnHabilidades,btnAjuda,btnMapa,btnSair;

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	/**
	 * Create the application.
	 */
	public PanelPause() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 1214, 681);
		panel.setLayout(null);
		
		btnVoltar = new JButton("Voltar ao Jogo");
		btnVoltar.setBounds(322, 186, 500, 35);
		panel.add(btnVoltar);
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD, 29));
		
		btnConfiguracoes = new JButton("Configura\u00E7\u00F5es");
		btnConfiguracoes.setBounds(588, 281, 240, 35);
		panel.add(btnConfiguracoes);
		btnConfiguracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfiguracoes.setFont(new Font("Century Gothic", Font.BOLD, 29));
		
		btnHabilidades = new JButton("Conquistas");
		btnHabilidades.setBounds(325, 281, 240, 35);
		panel.add(btnHabilidades);
		btnHabilidades.setFont(new Font("Century Gothic", Font.BOLD, 29));
		
		btnAjuda = new JButton("Ajuda");
		btnAjuda.setBounds(323, 236, 240, 35);
		panel.add(btnAjuda);
		btnAjuda.setFont(new Font("Century Gothic", Font.BOLD, 29));
		
		btnMapa = new JButton("Mapa");
		btnMapa.setBounds(585, 234, 240, 35);
		panel.add(btnMapa);
		btnMapa.setFont(new Font("Century Gothic", Font.BOLD, 29));
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(324, 342, 500, 35);
		panel.add(btnSair);
		btnSair.setFont(new Font("Century Gothic", Font.BOLD, 29));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
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
		this.btnVoltar = btnVoltar;
	}
	
	public JPanel getPanel() {
		return panel;
	}

}
