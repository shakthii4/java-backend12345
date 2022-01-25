package com.week2u.casestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.week2u.casestudy.service.**"})
public class WeekBankRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekBankRestAppApplication.class, args);
	}

}
