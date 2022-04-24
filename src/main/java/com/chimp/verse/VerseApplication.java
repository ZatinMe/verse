package com.chimp.verse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
		basePackages = {}, lazyInit = true)
@EnableAutoConfiguration(
		exclude = {
				LiquibaseAutoConfiguration.class,
				GsonAutoConfiguration.class})
public class VerseApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerseApplication.class, args);
	}

}
