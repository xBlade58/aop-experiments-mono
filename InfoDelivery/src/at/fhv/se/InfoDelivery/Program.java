package at.fhv.se.InfoDelivery;

public class Program {

	public static void main(String[] args) {
		MessageCommunicator mc = new MessageCommunicator();
		mc.deliver("Wanna learn AOP?");
		mc.deliver("Harry", "you ok?");
	}
}
