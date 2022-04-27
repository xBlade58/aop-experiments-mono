package at.fhv.se.InfoDelivery;

public aspect MannersAspect {

	pointcut deliverMessage() : call(* MessageCommunicator.deliver(..));
	
	before() : deliverMessage(){
		System.out.print("Hello! ");
	}
	
	after() : deliverMessage(){
		System.out.println("Yes!");
	}
}
