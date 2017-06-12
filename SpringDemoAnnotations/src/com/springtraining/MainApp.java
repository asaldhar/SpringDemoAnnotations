package com.springtraining;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
	    Coach coach = (Coach) context.getBean("cricketCoach", Coach.class);
	    System.out.println(coach.getDailyFortune());
	    System.out.println(coach.getDailyWorkout());
	    context.close();
	}

}
