package at.fhv.se.capture_jp.methodExecution;

import at.fhv.se.capture_jp.FooClass;

public aspect ExecutionRecipe {

	pointcut executionPointcut() : execution(void FooClass.foo(int, String));
	
	after() : executionPointcut() && !within(ExecutionRecipe +){
		System.out.println("[ExecutionRecipe]:  Signature: " + thisJoinPoint.getStaticPart().getSignature());
		System.out.println("[ExecutionRecipe]:  Source Line: " + thisJoinPoint.getStaticPart().getSourceLocation());
	}
}
