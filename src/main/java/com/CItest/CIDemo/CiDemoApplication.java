package com.CItest.CIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiDemoApplication.class, args);
		System.out.print("X branch change in yml");
	}

}
