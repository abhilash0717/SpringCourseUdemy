package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	//add fields for email address and team
	private String emailAddress;
	private String team;
	

	//dependency injection part here
	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket coach no arg constructor");
	}
	
	
	//our setter method for injecting dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach inside the setter method");
		this.fortuneService = fortuneService; 
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach inside the setter method of email address");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Cricket coach inside the setter method of team");
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
