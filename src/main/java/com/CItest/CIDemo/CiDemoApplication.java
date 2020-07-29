package com.CItest.CIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemoApplication {

	public static void main(String[] args) {
		System.out.print("Small change 2");
		SpringApplication.run(CiDemoApplication.class, args)
	}

}
