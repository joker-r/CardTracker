package com.cardtracker.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class CardTracker {

	public static void main(String[] args) {
		SpringApplication.run(CardTracker.class, args);
	}

}
