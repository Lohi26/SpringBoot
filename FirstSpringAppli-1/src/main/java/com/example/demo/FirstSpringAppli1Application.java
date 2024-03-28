package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringAppli1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstSpringAppli1Application.class, args);
		Something some=context.getBean(Something.class);
		Something thing=context.getBean(Something.class);
		some.show();
		thing.show();
	}

}
