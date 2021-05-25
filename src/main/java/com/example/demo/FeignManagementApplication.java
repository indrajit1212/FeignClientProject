package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignManagementApplication {

	public static void main(final String[] args) {
		SpringApplication.run(FeignManagementApplication.class, args);
	}

}
