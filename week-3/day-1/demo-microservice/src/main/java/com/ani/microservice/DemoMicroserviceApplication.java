package com.ani.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroserviceApplication.class, args);
	}

}
