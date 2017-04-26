package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.demo")
public class WebApplication {
	
	
	 public static void main(final String[] args) throws Exception {
		  SpringApplication.run(WebApplication.class, args);
	 }

}
