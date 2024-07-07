package br.com.teste.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.attornatus.models")
@ComponentScan(basePackages = {"br.com.attornatus.*"})
@EnableJpaRepositories(basePackages = {"br.com.attornatus.repositories"})
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

}
