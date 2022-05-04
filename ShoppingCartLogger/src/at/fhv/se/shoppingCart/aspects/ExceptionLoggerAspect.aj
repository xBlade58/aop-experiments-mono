package at.fhv.se.shoppingCart.aspects;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.Signature;

import at.fhv.se.shoppingCart.domain.ItemNotInStockException;

public aspect ExceptionLoggerAspect {

//	Logger _logger = Logger.getLogger("exceptions");
//	
//	public ExceptionLoggerAspect() {
//		_logger.setLevel(Level.ALL);
//	}
//	
//	pointcut exceptionLogMethods():
//		call(* at.fhv.se.shoppingCart.domain.Inventory.*(..)) && !within(ExceptionLoggerAspect);
//	
//	after() throwing(ItemNotInStockException ex) : exceptionLogMethods(){
//		if(_logger.isLoggable(Level.WARNING)) {
//			Signature sig = thisJoinPointStaticPart.getSignature();
//			_logger.logp(Level.WARNING, sig.getDeclaringType().getName(), sig.getName(), "Exception logger aspect", ex);
//		}
//	}
}
