package com.vsbrasil.vsbapi;

import com.vsbrasil.vsbapi.repository.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class VsbapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsbapiApplication.class, args);
	}

}
