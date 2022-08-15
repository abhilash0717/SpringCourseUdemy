package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		//System.out.println("fortune method of happy fortune service class");
		return "Today is your lucky day";
	}
}
