package com.ccneff.helloboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages={"com.ccneff.helloboot"})
public class HellobootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);

		log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
	}
}
