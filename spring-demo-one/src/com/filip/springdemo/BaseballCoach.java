package com.filip.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "spend 10 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
