package com.example.GYM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymManagementApplication {

	public static void main(String[] args) {
		
		System.setProperty("server.port","9090");
		SpringApplication.run(GymManagementApplication.class, args);
	}

}
