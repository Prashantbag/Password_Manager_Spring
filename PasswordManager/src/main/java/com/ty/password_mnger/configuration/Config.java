package com.ty.password_mnger.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.ty.password_mnger")
@EnableWebMvc
public class Config 
{
	@Bean
	public EntityManagerFactory entityManagerFactory()
	{
		return Persistence.createEntityManagerFactory("spring");
	}
}
