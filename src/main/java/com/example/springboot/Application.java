package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private String TAG = "GreetingsApplication";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
