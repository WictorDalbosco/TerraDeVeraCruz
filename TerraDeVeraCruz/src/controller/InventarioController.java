package controller;

import java.util.ArrayList;

import model.Inventario;
import model.Slot;
import view.PanelInventario;
import view.PanelSlot;
import view.TelaJogo;


public class InventarioController {
	private Slot slot;
	
	private ArrayList<Slot> slots;
	private PanelInventario inventario;
	private TelaJogo jogo;
	
	public InventarioController(ArrayList<Slot> slots, PanelInventario inventario, TelaJogo jogo ) {
		this.slots = slots;
		this.inventario = inventario;
		this.jogo = jogo;
	}

	public void inicializaController() {
		inventario.insereItem(slots);
	}
	
	public void encerraController() {
		jogo.removePanel(inventario.getPanel());
	}
	
	
	

}
