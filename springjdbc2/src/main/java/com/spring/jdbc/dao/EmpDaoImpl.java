package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Employee;

public class EmpDaoImpl implements EmpDao{
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		
		String q = "insert into emp_data(eid,ename,dname) values(?,?,?)";
		int r = this.jdbcTemplate.update(q,employee.getEid(), employee.getEname(), employee.getDname());
		return r;

	}
	public int update(Employee employee) {
		String u="update emp_data set ename=? where eid=?";
		int r= this.jdbcTemplate.update(u , employee.getEname(), employee.getEid());
		
		return r;
		
	}
	public int delete(Employee employee) {
		String u="delete from emp_data where eid=?";
		int r= this.jdbcTemplate.update(u , employee.getEid());
		
		return r;
		
	}


	
	public Employee getEmployee(int Eid) {
		String ca= "select *from Employee where Eid=?";
		RowMapper<Employee> rm= new RawMapperImpl();
		Employee employee =this.jdbcTemplate.queryForObject(ca,rm, Eid);
		
		return employee;
		
	}
	public List<Employee> getAllEmp(){
		String a ="select * from Employee";
		List<Employee> employee =this.jdbcTemplate.query(a, new RawMapperImpl());
		
		return employee;
	}
	

}