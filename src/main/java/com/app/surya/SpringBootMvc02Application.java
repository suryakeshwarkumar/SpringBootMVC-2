package com.app.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.app.surya"})
public class SpringBootMvc02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc02Application.class, args);
	}

}
