package at.fhv.se.relationships;

//pointcut declaration of BasePointcutDefinitions reused
public aspect ReusePointcutsRecipe extends BasePointcutDefinitionsAspect{

	before() : callPointcut() && !within(ReusePointcutsRecipe+){
		System.out.println("In the advice attached to the call");
		System.out.println("Signature: " + thisJoinPoint.getStaticPart().getSignature());
		System.out.println("Source Location: " + thisJoinPoint.getStaticPart().getSourceLocation());
	}
	
}
