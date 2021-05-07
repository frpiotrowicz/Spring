package com.filip.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "throw for 3 point from 3 positions, 30 times each";
	}

	@Override
	public String getDailyFortune() {
		return "Go for it. " + fortuneService.getFortune();
	}

}
