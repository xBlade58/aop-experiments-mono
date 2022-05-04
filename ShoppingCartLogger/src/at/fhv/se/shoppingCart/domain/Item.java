package at.fhv.se.shoppingCart.domain;

import java.util.logging.*;

public class Item {
	
	private String _id;
	private float _price;
	
	public Item(String id, float price) {
		super();
		_id = id;
		_price = price;
	}

	public String getId() {
		return _id;
	}


	public float getPrice() {
		return _price;
	}
	
	public String toString() {
		return "Item: " + _id;
	}

			

}
