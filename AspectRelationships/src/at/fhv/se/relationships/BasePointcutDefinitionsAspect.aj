package at.fhv.se.relationships;

public abstract aspect BasePointcutDefinitionsAspect {

	public pointcut callPointcut() : call(void FooClass.foo(int, String));
}
