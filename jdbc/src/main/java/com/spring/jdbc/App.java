package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext c;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate t= c.getBean("jdbcTemplate" , JdbcTemplate.class);
        String q = "insert into emp_data(eid,ename,salary)value(101,'charizard',35000)";
        int result = t.update(q);
        System.out.println("record inserted" + result);
    }
}
