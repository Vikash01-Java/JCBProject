package com.training.dao;

import java.sql.SQLException;

import com.training.entity.Employee;

public interface EmployeeDao {

	public void saveEmployee(Employee e)throws SQLException;
	
	public void updateEmployee(Employee e);
	
	public void deleteEmployeeById(int id);
	
	public void getAllEmployee();
	
	public Employee getEmployeeBy(int id);
	
	

}
