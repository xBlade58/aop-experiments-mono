package at.fhv.se.shoppingCart.aspects;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.Signature;

public aspect TraceAspectV2 {
	
	
//	private Logger _logger = Logger.getLogger("trace");
//	
//	TraceAspectV2() {
//		_logger.setLevel(Level.ALL);
//	}
//	
//	pointcut traceMethods(): // all methods in at.fhv.se.shoppingCart including its subpackages
//		(execution(* at.fhv.se.shoppingCart..*.*(..)) || execution(at.fhv.se.shoppingCart..*.new(..))) && !within(TraceAspectV2);
//	
//	before() : traceMethods(){
//		if(_logger.isLoggable(Level.INFO)) {
//			Signature sig = thisJoinPoint.getStaticPart().getSignature();
//			_logger.logp(Level.INFO, sig.getDeclaringType().getName(), sig.getName(), "Entering");
//		}
//	}
	
	
}
