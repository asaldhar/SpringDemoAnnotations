package com.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesAnnotationDemo
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        SwimCoach coach = (SwimCoach) context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        coach.show();
    }

}
