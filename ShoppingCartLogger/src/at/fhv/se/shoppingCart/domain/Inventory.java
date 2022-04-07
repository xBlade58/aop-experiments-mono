package at.fhv.se.shoppingCart.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inventory {

	
	private List<Item> _items = new LinkedList<Item>();
	//static Logger _logger = Logger.getLogger("trace");

	
	public void addItem(Item item ) {
		//_logger.logp(Level.INFO, "Inventory", "addItem", "Entering");
		_items.add(item);
	}
	
	public void removeItem(Item item) throws ItemNotInStockException {
		//_logger.logp(Level.INFO, "Inventory", "removeItem", "Entering");
		
		if(!_items.remove(item)) {
			throw new ItemNotInStockException(item);
		}
	}
	
	
}
