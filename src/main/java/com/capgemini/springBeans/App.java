package com.capgemini.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Producto;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext appContext = new ClassPathXmlApplicationContext("src/main/resources/beans.xml");
       
       Producto chorizo = (Producto) appContext.getBean("producto");
       System.out.println(chorizo.getNombre());
       
       ((ConfigurableApplicationContext)appContext).close();
    }
}
