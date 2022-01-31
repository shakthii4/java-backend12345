package com.shakthi.day3.project;

import com.shakthi.day3.project.home.Home;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day3DemoApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(Day3DemoApplication.class, args);
		Home h=context.getBean(Home.class,args);
		h.connect();
		Home h2=context.getBean(Home.class,args);
		h2.connect();
	}

}
