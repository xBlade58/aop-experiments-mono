package at.fhv.se.shoppingCart.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartOperator {
		
	public static void addShoppingCartItem(ShoppingCart sc, Inventory inventory, Item item) {
		try {
			inventory.removeItem(item);
			sc.addItem(item);
		} catch (ItemNotInStockException e) {
			//e.printStackTrace();	
		}		
	}
	
	public static void removeShoppingCartItem(ShoppingCart sc, Inventory inventory, Item item) {
		sc.removeItem(item);
		inventory.addItem(item);
	}
}
