package com.training;

import java.sql.SQLException;

import com.training.dao.EmployeeDao;
import com.training.dao.EmployeeDaoImpl;
import com.training.dao.StudentDao;
import com.training.dao.StudentDaoImpl;
import com.training.entity.Student;

public class Main1 {

	public static void main(String[] args) throws SQLException  {
	
//		int id=7;
//		String name="mohit";
//		String gender="male";
//		
//		
//		
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","Root");
//		
//		Statement stm=con.createStatement();
//		
////		stm.executeUpdate("insert into person value(6,'rohit','male')");
//		stm.executeUpdate("insert into person value("+id+",'"+name+"','"+gender+"')");
//		
//		
//		
//
//		
//		
//		System.out.println("succesfull");
		
		
		StudentDao dao =  new StudentDaoImpl();
		
		
		Student s = new Student(6,"aalia","female");
		
//		dao.saveStudent(s);
//		dao.updateStudent(s);
//		dao.deleteStudentById(10);
//		dao.getAllStudent();
//	
//		Student person = dao.getStudentById(4);
//		
//		System.out.println(person);
//		System.out.println("succesfull");
		
		
		
		

	}

}
