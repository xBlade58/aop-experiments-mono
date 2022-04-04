package at.fhv.se.capture_jp.passedValues;

import at.fhv.se.capture_jp.FooClass;

// We want to capture the parameters passed to a called method
public aspect CaptureCallParametersRecipe {
	pointcut captureCallParams(int value, String name) :
		call(void FooClass.foo(int, String)) && args(value, name);
	
	before(int value, String name) : captureCallParams(value, name){
		
		System.out.println("[CaptureCallParametersRecipe]:   captured int param on method: " + value);
		System.out.println("[CaptureCallParametersRecipe]:   captured String param on method: " + name);
	}
}
