package at.fhv.se.shoppingCart.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCart {

	private List<Item> _items = new LinkedList<Item>();
	
	public void addItem(Item item ) {
		
		_items.add(item);
	}
	
	public void removeItem(Item item) {

		_items.remove(item);
	}
	
	public void empty () {

		_items.clear();
	}
	
	public float toatlValue() {

		float rtValue = 0;
		for(Item i : _items) {
			rtValue += i.getPrice();
		}
		return rtValue;
	}
}
