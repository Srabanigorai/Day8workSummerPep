package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.MyServices;

@SpringBootApplication
public class AopDemoApplication implements CommandLineRunner{
@Autowired
private MyServices myServices;

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		myServices.displayMessage();
	}

}
