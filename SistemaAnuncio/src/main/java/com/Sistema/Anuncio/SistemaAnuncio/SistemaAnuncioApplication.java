package com.Sistema.Anuncio.SistemaAnuncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = "com.Sistema.Anuncio.SistemaAnuncio.models")
@ComponentScan(basePackages = "SistemaAnuncio.*")
@EnableJdbcRepositories(basePackages = "com.Sistema.Anuncio.SistemaAnuncio.Repository")
@EnableTransactionManagement
public class SistemaAnuncioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaAnuncioApplication.class, args);
	}

}
