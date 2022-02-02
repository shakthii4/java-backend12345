package com.shakthi.dependancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BasicProjectApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(BasicProjectApplication.class, args);

		/*Airtel airtel=new Airtel();
		airtel.calling();
		airtel.data();
		Vodafone vodafone=new Vodafone();
		vodafone.calling();
		vodafone.data();*/

		/*Sim sim=new Vodafone(); //we can use here interface that is runtime polymorhpism
		sim.calling();
		sim.data();*/

		//ques-> in future i want change my modules without change my code then we go for spring framework
		//spring can create an object for u
		//spring can manage your objects
		//spring have own container called IOC container
		//what ever the class mentioned in config file spring will create that class objects in Ioc container it is called as spring beans.
		//i want to use "A" class object,with the help of getBean("A");
		//2 types of iOC container 1.BeanFactory 2.ApplicationContext
		//1.BeanFactory         - Interfaces - legacy
		//2.Application Context - Interfaces
		//we want to implement this ApplicationContext classPathXmlApplicationContext class in tis class implementing ApplicationContext

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml config");
		Airtel air= (Airtel) context.getBean("airtel");
		air.calling();
		air.data();

		Airtel sim = context.getBean("airtel", Airtel.class);//alter for typecasting  


	}

}
