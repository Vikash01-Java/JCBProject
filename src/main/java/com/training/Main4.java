package com.training;
import com.training.dao.Employee2DaoImpl;
import com.training.entity.Employee1;
import com.training.entity.Student;
import com.training.dao.Employee1DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.dao.Employee1Dao;
public class Main4 {

	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
	Employee1Dao dao = new Employee1DaoImpl();
	
//	Employee1 s = new Employee1(20,"rahul","male",600000);
	
//	dao.saveEmployee(s);
//	dao.updateEmployee(s);
//	dao.deleteEmployeeById(16);
	
	


//  dao.getAllEmplyee();
//	dao.printAllEmployees();
//	dao.printEmployeeByName("saloni");

	
	Employee1 e =dao.printEmployeeByName("Vikas' OR '1'='1");
    System.out.println(e);
//=============================================
//	Employee1 e =dao.getEmployeeById(4);
//    System.out.println(e);
	
//	Employee1 e =dao.printEmployeeByName("saloni' OR '1'='1");
//    System.out.println(e);

	
	
	
	   
	}
}
