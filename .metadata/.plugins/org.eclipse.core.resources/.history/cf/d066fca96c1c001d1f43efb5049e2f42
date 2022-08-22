package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
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
