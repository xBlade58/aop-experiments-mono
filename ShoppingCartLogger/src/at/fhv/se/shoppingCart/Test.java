package at.fhv.se.shoppingCart;

import java.util.logging.Level;
import java.util.logging.Logger;

import at.fhv.se.shoppingCart.domain.Inventory;
import at.fhv.se.shoppingCart.domain.Item;
import at.fhv.se.shoppingCart.domain.ShoppingCart;
import at.fhv.se.shoppingCart.domain.ShoppingCartOperator;

public class Test {
	
	public static void main(String [] args) {

		Inventory inventory = new Inventory();
		Item trouses = new Item ("Trousers", 20);
		Item shirt = new Item("T-Shirt", 15);
		Item glasses = new Item("sun glasses", 7.99f);
		Item book = new Item("AspectJ-Book", 30);
		
		inventory.addItem(trouses);
		inventory.addItem(shirt);
		inventory.addItem(glasses);
		
		ShoppingCart sc = new ShoppingCart();
		ShoppingCartOperator.addShoppingCartItem(sc, inventory, glasses);
		ShoppingCartOperator.addShoppingCartItem(sc, inventory, shirt);
		//ShoppingCartOperator.addShoppingCartItem(sc, inventory, aopBook); //add item which isn't in inventory
		System.out.println("Program exited.");
	}
}
