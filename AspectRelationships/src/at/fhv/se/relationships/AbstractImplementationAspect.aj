package at.fhv.se.relationships;

public aspect AbstractImplementationAspect extends BaseAbstractAspect {

	public pointcut abstractBasePointcut() : call(void FooClass.foo(int, String));
	
	before() : runAdvicePointcut(){
		System.out.println("In the advice attached to the call. Aspect: " + this.toString());
		System.out.println("Signature: " + thisJoinPoint.getStaticPart().getSignature());
		System.out.println("Source Location: " + thisJoinPoint.getStaticPart().getSourceLocation());
	}
}
