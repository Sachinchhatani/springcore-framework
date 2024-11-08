package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Employee;

public class RawMapperImpl implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.setEid(rs.getInt(1));
		e1.setEname(rs.getString(2));
		e1.setDname(rs.getString(3));
		return e1;
	}

}
