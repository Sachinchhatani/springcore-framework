package com.SCore.awprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/SCore/awprac/config.xml");
		Question Que = (Question)context.getBean("Que");
		System.out.println(Que);

	}

}
