package com.training.dao;

import java.sql.SQLException;

import com.training.entity.Employee1;

public interface Employee1Dao {

public void saveEmployee(Employee1 e) throws SQLException;
	
//	public void saveEmployeeByPS(Employee1 e);

	public void updateEmployee(Employee1 e);

	public void deleteEmployeeById(int id);

	public Employee1 getEmployeeById(int id);

	public void printAllEmployees();

	public void getAllEmplyee();
	
    public Employee1 printEmployeeByName(String name);
    


//	
//	public void printEmployeeByNameByPs(String name);
//
//	public List<Employee> getAllEmployees();

    
}
