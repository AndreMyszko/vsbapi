package com.vsbrasil.vsbapi;

import com.vsbrasil.vsbapi.repository.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class VsbapiApplication {

	//Create Bean to consume external apis:
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	//Deafault Run project:
	public static void main(String[] args) {
		SpringApplication.run(VsbapiApplication.class, args);
	}

}
