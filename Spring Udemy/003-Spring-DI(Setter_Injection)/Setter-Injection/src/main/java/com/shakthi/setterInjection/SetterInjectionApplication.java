package com.shakthi.setterInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication
{

	public static void main(String[] args)
	{

		//SpringApplication.run(SetterInjectionApplication.class, args);

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		CricketCoach cricketCoach=context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyworkout());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());

	}

}
