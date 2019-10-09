package model;

public class Slot {
	private int id;
	private String item;
	
	public Slot() {
		
	}
	
	public Slot(int id, Item item) {
		this.id = id;
		this.item = item.getNome();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
	
	

}
