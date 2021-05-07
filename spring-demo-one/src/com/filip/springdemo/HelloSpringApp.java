package com.filip.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring conf file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive spring container
//		Coach baseballCoach = context.getBean("BaseballCoach", Coach.class);
//		
//		Coach trackCoach = context.getBean("TrackCoach", Coach.class);
//		
//		Coach basketballCoach = context.getBean("BasketballCoach", Coach.class);
//		
//		//call methods on the bean
//		System.out.println(baseballCoach.getDailyWorkout());
//		
//		//call new method for fortunes
//		System.out.println(baseballCoach.getDailyFortune());
//		
//		
//		
//		//call methods on the bean
//		System.out.println(basketballCoach.getDailyWorkout());
//				
//		//call new method for fortunes
//		System.out.println(basketballCoach.getDailyFortune());
//		
//
//		
//		//call methods on the bean
//		System.out.println(trackCoach.getDailyWorkout());
//				
//		//call new method for fortunes
//		System.out.println(trackCoach.getDailyFortune());
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getDailyWorkout());
		
		
		
		
		//close the context
		context.close();
	}

}
