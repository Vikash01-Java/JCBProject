package com.training;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.dao.EmployeeDao;
import com.training.dao.EmployeeDaoImpl;
import com.training.entity.Employee;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
//		1st--create the connection
//		2nd--cteate statement
		
////		Connection conn = DriverManager.getConnection("URL","USERNAME","PASS");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
//		
////		DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root").createStatement().executeUpdate("insert into employee value(13,'Sweeti','female',70000)");
//
////		try {
////			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
////		} catch (SQLException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//
//		Statement  stmt = conn.createStatement();
//		
//		 
//		
////		stmt.executeUpdate("insert into employee(id,name,gender,salary) value(10,'Tony','male',60000)");
////		stmt.executeUpdate("insert into employee value(11,'Ria','female',50000)");
//		
////		conn.createStatement().executeUpdate("insert into employee value(12,'sonia','female',50000)");
//		
//		
//		
//		System.out.println("TX Successfull inserted....................");
		
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
//		
//		Employee e = new Employee(14,"aman","mail",100000);
//		
//		dao.saveEmployee(e);
////		dao.updateEmployee(e);
////		dao.deleteEmployeeById(20);
////		dao.deleteEmployeeById(19);
////		dao.deleteEmployeeById(18);
////		dao.deleteEmployeeById(17);
////		dao.deleteEmployeeById(16);
////		dao.deleteEmployeeById(15);
////		dao.deleteEmployeeById(14);
////		dao.deleteEmployeeById(13);
//		
//		
////		dao.getAllEmployee();
//		
		Employee databaseEmp= dao.getEmployeeBy(5);




		System.out.println(databaseEmp);
//
//		
		System.out.println("TX Successfull inserted....................");

		
		

	}

}
