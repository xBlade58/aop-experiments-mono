package at.fhv.se.shoppingCart.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartOperator {

	static Logger _logger = Logger.getLogger("trace");
	
	
	public static void addShoppingCartItem(ShoppingCart sc, Inventory inventory, Item item) {
		//_logger.logp(Level.INFO, "ShoppingCartOperator", "addShoppingCartItem", "Entering");
		try {
			inventory.removeItem(item);
		} catch (ItemNotInStockException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
		}
		sc.addItem(item);
	}
	
	public static void removeShoppingCartItem(ShoppingCart sc, Inventory inventory, Item item) {
		//_logger.logp(Level.INFO, "ShoppingCartOperator", "removeShoppingCartItem", "Entering");

		sc.removeItem(item);
		inventory.addItem(item);
	}
}
