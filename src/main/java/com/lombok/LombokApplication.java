package com.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Person person = new Person( 1L, "John Doe", "que@emeal.com", "1234567890", "123 Main St", "Springfield", "IL", "USA", "62701", null);
			//si se usan los métodos setter
			/*person.setId(1L);
			person.setName("John Doe");
			person.setEmail("qew@emea.com");
			person.setPhone("1234567890");
			person.setAddress("123 Main St");
			person.setCity("Springfield");
			person.setState("IL");
			person.setCountry("USA");
			person.setZipCode("62701");
			person.setBirthDate(null);*/

			//si se usa el método estático of
			//Person persna = Person.of(1L, "John Doe", "que@emeal.com", "1234567890", "123 Main St", "Springfield", "IL", "USA", "62701", null);

			System.out.println(person);

			//si se usa el método estático builder
			Person person2 = Person.create()
					.id(1L)
					.name("John Doe")
					.build();

			System.out.println(person2);

		};

	}
}
