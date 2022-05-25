package com.capgemini.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Producto;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		
				Producto patata = (Producto) appContext.getBean("patata");
				

				

		((ConfigurableApplicationContext) appContext).close();
	}
}
