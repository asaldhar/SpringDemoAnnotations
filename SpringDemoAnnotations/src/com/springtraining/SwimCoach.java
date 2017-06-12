package com.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach
{
    @Autowired
    @Value("${foo.email}")
    private String email;
    
    @Autowired
    @Value("${foo.address}")
    private String address;
    
    @Autowired
    public SwimCoach(@Qualifier("randomService")FortuneService fortuneService)
    {
        System.out.println("You are in the constructor");
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout()
    {
        return "Practice daily by using floating devices";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
    
    public void show()
    {
       System.out.println("The email is : "+email);
       System.out.println("The address is : "+address);
    }

}
