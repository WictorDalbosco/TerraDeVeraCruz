package view;
import java.util.ArrayList;

import javax.swing.JButton;

import model.Slot;


public class SlotButton extends JButton {
	private ArrayList<Slot> item;
	
	
	public SlotButton(Slot item) {
		if (item != null) {
			this.setText(item.getItem());
		} else {
			this.setText("");
		}
	}


	public ArrayList<Slot> getItem() {
		return item;
	}


	public void setItem(ArrayList<Slot> item) {
		this.item = item;
	}  
	
	

}
