package com.filip.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//create a no-arg constractor
	
	public CricketCoach() {
		System.out.println("inside Cricket Coach constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice bowling for 10m";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	//setters and getters
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside Cricket Coach setter");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAdress) {
		System.out.println("inside email setter");
		this.emailAddress = emailAdress;
	}

	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("inside team setter");
		this.team = team;
	}

	
	
	
	

}
