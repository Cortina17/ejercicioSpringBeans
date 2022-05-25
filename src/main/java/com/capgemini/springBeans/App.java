package com.capgemini.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Producto;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Producto p = (Producto) appContext.getBean(Producto.class);
		System.out.println(
				"El nombre del producto es " + p.getNombre() + ", esta a " + p.getPrecio() + ", y como te llevas "
						+ p.getCantidad() + ", tienes que pagar: " + (p.getPrecio() * (p.getCantidad())));

		((ConfigurableApplicationContext) appContext).close();
	}
}
