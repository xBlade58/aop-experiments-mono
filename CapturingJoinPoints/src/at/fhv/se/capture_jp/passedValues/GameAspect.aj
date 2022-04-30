package at.fhv.se.capture_jp.passedValues;

import at.fhv.se.capture_jp.Game;

public aspect GameAspect {

	pointcut doAdvice() : call(String Game.getName());
	
	before() : doAdvice(){
		// advice logic
	}
}
