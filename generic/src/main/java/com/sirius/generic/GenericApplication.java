package com.sirius.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories("com.sirius.generic.dao")
public class GenericApplication {
	public static void main(String[] args) {
		SpringApplication.run(GenericApplication.class, args);
	}
}
