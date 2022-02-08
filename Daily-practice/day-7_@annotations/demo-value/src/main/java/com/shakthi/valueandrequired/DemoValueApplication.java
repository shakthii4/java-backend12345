package com.shakthi.valueandrequired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoValueApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoValueApplication.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(CollageConfig.class);
		Collage collage=context.getBean("collageBean",Collage.class); //@#1 CollageCongig
		System.out.println("Object  create "+collage);
		collage.test();
	}

}
