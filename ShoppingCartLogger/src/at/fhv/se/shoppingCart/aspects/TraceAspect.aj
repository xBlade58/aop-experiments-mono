package at.fhv.se.shoppingCart.aspects;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.Signature;

public aspect TraceAspect {
	
//	private Logger _logger = Logger.getLogger("trace");
//	
//	pointcut traceMethods():
//		execution(* *.*(..)) && !within(TraceAspect);
//	
//	before(): traceMethods(){
//		Signature sig = thisJoinPoint.getStaticPart().getSignature();
//		_logger.logp(Level.INFO, sig.getDeclaringType().getName(), sig.getName(), "Entering");
//	}
}
