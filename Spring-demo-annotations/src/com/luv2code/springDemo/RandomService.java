package com.luv2code.springDemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "you are getting an randome service";
	}

}
