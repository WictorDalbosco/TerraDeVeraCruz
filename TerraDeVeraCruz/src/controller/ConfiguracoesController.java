package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaConfiguracoes;

public class ConfiguracoesController {
	private TelaConfiguracoes tc;
	//private Usuario usuario;

	ConfiguracoesController(TelaConfiguracoes tc){
		this.tc = tc;
		//this.usuario = usuario;
	}
	
	public void inicializaController() {
		this.tc.getBtnVoltar().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				tc.getFrame().dispose();
								
			}
		});
	}
}