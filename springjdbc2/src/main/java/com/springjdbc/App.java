package com.springjdbc;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
    	ApplicationContext c = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	Employee c1 = new Employee();
    	c1.setEid(270);
    	c1.setEname("sachin Patel");
    	c1.setDname("Accountant");
    	int r = cd.insert(c1);
    	System.out.println("Record inserted" +r);
    	
//    	c1.setEid(270);
//    	c1.setEname("Munna");
//    
//    	int r=cd.update(c1);
//    	System.out.println("record updated" + r);
    	
//    	c1.setEid(270);;
//    	int f=cd.delete(c1);
//    	System.out.println("record deleted" + f);
    	
//    	Employee e1= cd.getEmployee(102);
//    	System.out.println(e1);
//    	
//    	List<Employee> emp = EmpDao.getAllEmp();
//    	for(Employee e2:emp) {
//    		System.out.println(e2);
//    	}
    	
    	
    	

    }
}