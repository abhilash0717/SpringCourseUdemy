package com.luv2code.springDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "this is from the sad fortune service";
	}

}
