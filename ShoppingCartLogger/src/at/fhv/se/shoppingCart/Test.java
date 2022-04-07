package at.fhv.se.shoppingCart;

import java.util.logging.Level;
import java.util.logging.Logger;

import at.fhv.se.shoppingCart.domain.Inventory;
import at.fhv.se.shoppingCart.domain.Item;
import at.fhv.se.shoppingCart.domain.ShoppingCart;
import at.fhv.se.shoppingCart.domain.ShoppingCartOperator;

public class Test {

	//static Logger _logger = Logger.getLogger("trace");
	
	public static void main(String [] args) {
		//_logger.logp(Level.INFO, "Test", "main", "Entering");
		Inventory inventory = new Inventory();
		Item itemHose = new Item ("Hose", 20);
		Item itemShirt = new Item("T-Shirt", 15);
		Item itemBrille = new Item("Sonnenbrille", 7.99f);
		Item aopBook = new Item("AspectJ-Book", 30);
		
		inventory.addItem(itemShirt);
		inventory.addItem(itemHose);
		inventory.addItem(itemBrille);
		
		ShoppingCart sc = new ShoppingCart();
		ShoppingCartOperator.addShoppingCartItem(sc, inventory, itemBrille);
		ShoppingCartOperator.addShoppingCartItem(sc, inventory, itemShirt);
		ShoppingCartOperator.addShoppingCartItem(sc, inventory, aopBook); //add item which isn't in inventory
	}
}
