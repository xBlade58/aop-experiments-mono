package at.fhv.se.shoppingCart.domain;

public class ItemNotInStockException extends Exception {

	public ItemNotInStockException(Item item) {
		super("Item is not in stock: " + item.get_id());
	}
}
