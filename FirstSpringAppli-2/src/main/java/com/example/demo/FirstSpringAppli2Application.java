package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringAppli2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstSpringAppli2Application.class, args);
		Something some=context.getBean(Something.class);
		some.print();
	}

}
