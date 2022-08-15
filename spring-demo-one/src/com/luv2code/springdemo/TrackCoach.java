package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		//System.out.println("no arg - constructor of track coach");
	}

	public TrackCoach(FortuneService fortuneService) {
		//System.out.println("parameterized constructor of track coach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it --> " + fortuneService.getFortune();
	}

}
