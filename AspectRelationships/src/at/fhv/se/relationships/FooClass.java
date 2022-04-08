package at.fhv.se.relationships;

public class FooClass {
	
	void foo(int number, String name) {
		System.out.println("I am doing foo things using: " + number + ", " + name);
	}

	public static void main(String[] args) {
		FooClass myClass = new FooClass();
		
		myClass.foo(10, "bob");
		
	}

}
