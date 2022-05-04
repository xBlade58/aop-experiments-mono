package at.fhv.se.shoppingCart.aspects;

import org.aspectj.lang.Signature;

public aspect TraceAspectV1 {

//	pointcut traceMethods(): // all methods in at.fhv.se.shoppingCart including in its subpackages
//		(execution(* at.fhv.se.shoppingCart.domain..*.*(..)) || execution(at.fhv.se.shoppingCart.domain..*.new(..))) 
//		&& !within(TraceAspectV1);
//	
//	before() : traceMethods() {
//		Signature sig = thisJoinPoint.getStaticPart().getSignature();
//		System.out.println("Entering [" + sig.getDeclaringType().getName() + "." + sig.getName() + "]");
//	}
}
