package com.capgemini.springBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.beans.Producto;

@Configuration
public class AppConfig {

	@Bean
	public Producto patata() {
		return new Producto();
	}

}