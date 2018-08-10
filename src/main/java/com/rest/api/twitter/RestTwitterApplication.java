package com.rest.api.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@ServletComponentScan
@ComponentScan("com.rest.api.twitter")
@EnableJpaRepositories("com.rest.api.twitter.Repository")
@EntityScan("com.rest.api.twitter.Model")
@EnableScheduling
@SpringBootApplication
public class RestTwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTwitterApplication.class, args);
	}
}
