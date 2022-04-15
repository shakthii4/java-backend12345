package com.shakthi.setterInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependancyInjectionApplication
{

	public static void main(String[] args)
	{
		//SpringApplication.run(DependancyInjectionApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Coach thecoach = context.getBean("mycoach1", Coach.class);
		System.out.println(thecoach.getDailyworkout());
		System.out.println(thecoach.getDailyFortune());
		}

}
