package com.filip.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run Run ";
	}

	@Override
	public String getDailyFortune() {
		return "Go Go " + fortuneService.getFortune() ;
	}

}
