package com.springtraining;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		System.out.println("Inside HappyFortuneService getFortune() method");
		return "You are lucky today";
	}

}
