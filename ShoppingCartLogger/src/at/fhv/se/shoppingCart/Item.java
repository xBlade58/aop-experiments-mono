package at.fhv.se.shoppingCart;

public class Item {
	
	private String _id;
	private float _price;
	
	public Item(String _id, float _price) {
		super();
		this._id = _id;
		this._price = _price;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public float get_price() {
		return _price;
	}

	public void set_price(float _price) {
		this._price = _price;
	}
			

}
