package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		//System.out.println("fortune method of happy fortune service class");
		return "Today is your lucky day";
	}

	@Override
	public String getRandomFortune(int num) {
		// TODO Auto-generated method stub
		return null;
	}
}
