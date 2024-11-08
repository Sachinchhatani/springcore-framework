package com.SC.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context1;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context1 = new ClassPathXmlApplicationContext("config.xml");
        Employee emp1= (Employee)context1.getBean("emp");
        System.out.print(emp1);
    }
}
