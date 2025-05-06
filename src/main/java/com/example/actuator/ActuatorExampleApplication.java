package com.example.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring Boot main class
 */
@SpringBootApplication
//@EnableScheduling
public class ActuatorExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorExampleApplication.class, args);
	}

}
