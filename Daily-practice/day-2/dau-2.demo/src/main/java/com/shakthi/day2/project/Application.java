package com.shakthi.day2.project;

import com.shakthi.day2.project.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

@SpringBootApplication

public class Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}




}
