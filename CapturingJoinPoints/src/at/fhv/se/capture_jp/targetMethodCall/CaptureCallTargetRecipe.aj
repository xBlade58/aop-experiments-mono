package at.fhv.se.capture_jp.targetMethodCall;

import at.fhv.se.capture_jp.FooClass;

// we want to access the object of a called method
public aspect CaptureCallTargetRecipe {

	pointcut captureCallTarget(FooClass cl):
		call(void FooClass.foo(int, String)) && target(cl);
	
	before(FooClass cl) : captureCallTarget(cl){
		System.out.println("[CaptureCallTargetRecipe]:  capture target object for method call: " + cl);
	}
}
