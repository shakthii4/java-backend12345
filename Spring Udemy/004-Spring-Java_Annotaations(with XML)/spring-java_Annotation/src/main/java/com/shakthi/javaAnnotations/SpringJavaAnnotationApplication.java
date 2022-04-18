package com.shakthi.javaAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringJavaAnnotationApplication
{

	public static void main(String[] args)
	{
		//SpringApplication.run(SpringJavaAnnotationApplication.class, args);

		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//get the bean from spring container
		Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
	}

}
