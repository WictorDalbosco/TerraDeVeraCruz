package model;

import java.util.ArrayList;

public class Inventario {
	public static ArrayList<Slot> inventario = new ArrayList();
	
	public void addSlot(Slot slot) {
		inventario.add(slot);
	}
	
	public ArrayList<Slot> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<Slot> inventario) {
		this.inventario = inventario;
	}
}
