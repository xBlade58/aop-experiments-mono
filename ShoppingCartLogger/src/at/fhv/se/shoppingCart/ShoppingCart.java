package at.fhv.se.shoppingCart;

import java.util.List;
import java.util.Vector;

public class ShoppingCart {

	private List _items = new Vector();
	
	public void addItem(Item item ) {
		_items.add(item);
	}
	
	public void removeItem() {
		
	}
}
