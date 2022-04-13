package com.shakthi.IOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DemoIocApplication
{

	public static void main(String[] args)
	{
		//SpringApplication.run(DemoIocApplication.class, args);
		//Coach theCoach=new /*TrackCoack();*/ BaseballCoach();      /* Still HardCoaded*/
		//System.out.println(theCoach.getDailyWorkout());

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Coach thecoach=context.getBean("mecoach",Coach.class);
		System.out.println(thecoach.getDailyWorkout());
	}

}
