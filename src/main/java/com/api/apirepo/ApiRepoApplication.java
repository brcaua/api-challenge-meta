package com.api.apirepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
// @ComponentScan(basePackages = {"com.api.apirepo.config", "com.api.apirepo.controller"})
public class ApiRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRepoApplication.class, args);
	}
}