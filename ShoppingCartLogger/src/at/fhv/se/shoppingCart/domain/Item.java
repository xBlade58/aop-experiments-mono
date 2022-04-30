package at.fhv.se.shoppingCart.domain;

import java.util.logging.*;

public class Item {
	
	private String _id;
	private float _price;
	
	public Item(String _id, float _price) {
		super();
		this._id = _id;
		this._price = _price;
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
