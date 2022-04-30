package at.fhv.se.shoppingCart.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inventory {
	
	private List<Item> _items = new LinkedList<Item>();

	public void addItem(Item item ) {
		_items.add(item);
	}
	
	public void removeItem(Item item) throws ItemNotInStockException {		
		if(!_items.remove(item)) {
			throw new ItemNotInStockException(item);
		}
	}
	
	
}
