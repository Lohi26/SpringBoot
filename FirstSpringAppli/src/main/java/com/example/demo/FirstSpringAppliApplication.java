package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringAppliApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstSpringAppliApplication.class, args);
		Something some=context.getBean(Something.class);
		some.show();
	}

}
