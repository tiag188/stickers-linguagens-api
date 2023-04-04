package br.com.alura.linguagens.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class LinguagensApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinguagensApiApplication.class, args);
	}

}
