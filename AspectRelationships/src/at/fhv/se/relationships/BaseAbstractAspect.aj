package at.fhv.se.relationships;

public abstract aspect BaseAbstractAspect {

	public abstract pointcut abstractBasePointcut();
	
	pointcut runAdvicePointcut() : abstractBasePointcut() && !within(BaseAbstractAspect+);
}
