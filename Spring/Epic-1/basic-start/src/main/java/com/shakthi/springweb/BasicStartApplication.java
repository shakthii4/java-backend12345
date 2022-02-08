package com.shakthi.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicStartApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(BasicStartApplication.class, args);
		EmailClient emailClient=new EmailClient(new AdvancedSpellChecker());   	//	SpellChecker spellChecker=new BasicSpellChecker();
		emailClient.sendEmail("hi this is first msg");
	}

}
