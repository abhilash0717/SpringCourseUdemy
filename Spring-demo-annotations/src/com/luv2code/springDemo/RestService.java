package com.luv2code.springDemo;

import org.springframework.stereotype.Component;

@Component
public class RestService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "you are getting an rest fortune service";
	}

}
