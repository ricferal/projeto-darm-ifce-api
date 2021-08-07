package com.darm.ifce.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DarmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarmApiApplication.class, args);
	}

}
