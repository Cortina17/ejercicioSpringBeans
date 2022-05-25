package com.capgemini.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");
       
       ((ConfigurableApplicationContext)appContext).close();
    }
}
