package com.training;

import java.sql.SQLException;

import com.training.dao.Employee1Dao;
import com.training.dao.Employee2DaoImpl;
import com.training.dao.Employee3DaoImpl;
import com.training.entity.Employee1;

public class Main5 {

	public static void main(String[] args) throws SQLException {

		Employee1Dao dao = new Employee3DaoImpl();
		
//		Employee1 s = new Employee1(1,"MOHIT","male",600000);
		Employee1 s1 = new Employee1(1,"mohan","male",600000);

//		
		
//		dao.saveEmployee(s);
//		dao.saveEmployee(s1);
//		dao.saveEmployee(s2);
//		dao.saveEmployee(s3);
//		dao.saveEmployee(s4);
//		dao.saveEmployee(s5);
		
//		dao.updateEmployee(s1);
//		
//		dao.deleteEmployeeById(s1.getId());
//		dao.getAllEmplyee();
		
//		dao.batchInsert();
		

		System.out.println("succesfull done ");


		
		
		
	}

}
