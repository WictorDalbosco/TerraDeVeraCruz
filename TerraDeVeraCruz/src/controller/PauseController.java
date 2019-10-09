package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.PanelPause;
import view.TelaConfiguracoes;
import view.TelaPause;

public class PauseController {
	private PanelPause pause;
	//private Usuario usuario;

	PauseController(PanelPause pause){
		this.pause = pause;
		//this.usuario = usuario;
	}
	
	public PauseController(TelaPause telaPause) {
		// TODO Auto-generated constructor stub
	}

	public void inicializaController() {
		this.pause.getBtnVoltar().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				exclui();				
			}
		});
		this.pause.getBtnConfiguracoes().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

				TelaConfiguracoes tc = new TelaConfiguracoes();
				
								
			}
		});
	}
	
	public void exclui() {
		System.out.println("ent");
		pause.getPanel().disable();

	}
}