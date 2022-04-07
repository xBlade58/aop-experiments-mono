package at.fhv.se.shoppingCart.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCart {

	private List<Item> _items = new LinkedList<Item>();
	//static Logger _logger = Logger.getLogger("trace");
	
	public void addItem(Item item ) {
		//_logger.logp(Level.INFO, "ShoppingCart", "addItem", "Entering");
		_items.add(item);
	}
	
	public void removeItem(Item item) {
		//_logger.logp(Level.INFO, "ShoppingCart", "removeItem", "Entering");
		_items.remove(item);
	}
	
	public void empty () {
		//_logger.logp(Level.INFO, "ShoppingCart", "empty", "Entering");
		_items.clear();
	}
	
	public float toatlValue() {
		//_logger.logp(Level.INFO, "ShoppingCart", "totalValue", "Entering");
		float rtValue = 0;
		for(Item i : _items) {
			rtValue += i.get_price();
		}
		return rtValue;
	}
}
