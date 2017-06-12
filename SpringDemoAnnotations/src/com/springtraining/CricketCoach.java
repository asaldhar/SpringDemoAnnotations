package com.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	public FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run for 10 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
