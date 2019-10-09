package controller;

import model.Slot;
import view.PanelSlot;

public class PanelSlotController {
	private Slot slot;
	private PanelSlot panelSlot;

	public PanelSlotController(PanelSlot panels, Slot s) {
		panelSlot = panels;
		slot = s;
	}

	public void inicializaController() {
		panelSlot.getLabel().setText(Integer.toString(slot.getId()));
		panelSlot.getLabel_1().setText(slot.getItem());
	}
}
