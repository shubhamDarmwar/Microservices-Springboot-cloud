package com.lightning.app.universitymonolithicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.lightning.controller", "com.lightning.service"})
@EntityScan("com.lightning.entity")
@EnableJpaRepositories("com.lightning.repository")
public class UniversityMonolithicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityMonolithicAppApplication.class, args);
	}

}
