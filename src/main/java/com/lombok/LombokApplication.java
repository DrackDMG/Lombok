package com.lombok;

import lombok.extern.java.Log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@Log // no es tan recomendado usarlo de esta forma
@Slf4j // es mejor usarlo de esta forma
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Person person = new Person( 1L, "John Doe", "que@emeal.com", "1234567890", "123 Main St", "Springfield", "IL", "USA", "62701", null);
			System.out.println(person);
			log.info(person.toString());
			//maneja info, warning, error, etc

		};

	}
}
