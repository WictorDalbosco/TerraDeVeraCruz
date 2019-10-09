package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.SystemColor;

public class TelaJogo {

	private JFrame frame;
	private JPanel panelJ = new JPanel();
	
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Create the application.
	 */
	public TelaJogo() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, 1230, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		panelJ.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panelJ, BorderLayout.CENTER);
		panelJ.setLayout(null);
		
		
	}
	
	public void addPanel(JPanel i) {
		panelJ.add(i);
	}
	
	public void removePanel(JPanel i) {
		panelJ.remove(i);
	}
	
}
