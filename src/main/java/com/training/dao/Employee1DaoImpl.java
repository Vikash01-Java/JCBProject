package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.entity.Employee1;

public class Employee1DaoImpl implements Employee1Dao {

	private static Connection conn=null;
	
	public static final String INSERT_QUERY ="INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES (%d,'%s','%s',%d)";
	public static final String UPDATE_QUERY ="UPDATE EMPLOYEE1 SET NAME = %s , GENDER = %s, SALARY = %d  WHERE ID = %d";
	public static final String DELETE_QUERY ="DELETE FROM EMPLOYEE WHERE ID = %d";
	
	public static final String SELECT_QUERY ="SELECT * FROM EMPLOYEE";
	public static final String SELECT_QUERY_BY_ID ="SELECT*FROM EMPLOYEE WHERE ID= %d";
	public static final String SELECT_QUERY_BY_NAME ="SELECT*FROM EMPLOYEE WHERE NAME= %s";


	static {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void saveEmployee(Employee1      e) throws SQLException {
		Statement  sts = conn.createStatement();
		sts.execute(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
//                                        or
		sts.executeUpdate("INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES("+e.getId()+",'"+e.getName()+"','"+e.getGender()+"','"+e.getSalary()+"')");

	}

	@Override
	public void updateEmployee(Employee1 e) {
		try {
			Statement  sts = conn.createStatement();
			sts.executeUpdate(String.format(UPDATE_QUERY,e.getName(),e.getGender(),e.getSalary(),e.getId()));
//			                            OR
			sts.executeUpdate("UPDATE EMPLOYEE1 SET NAME = '"+e.getName()+"' , GENDER = '"+e.getGender()+"' , SALARY = "+e.getSalary()+" WHERE ID = "+e.getId());

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

			
	}

	@Override
	public void deleteEmployeeById(int id) {
		try {
			Statement  sts = conn.createStatement();
			sts.executeUpdate("DELETE FROM EMPLOYEE WHERE ID = "+id);
//			                   or
			sts.executeUpdate(String.format(DELETE_QUERY,id));


		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
	}

	@Override
	public Employee1 getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1();
		try (Statement statement = conn.createStatement();) {

//			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE ID = " + id);
//			or
			ResultSet rs = statement.executeQuery(String.format(SELECT_QUERY_BY_ID, id));

			rs.next();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setGender(rs.getString(3));
			e.setSalary(rs.getInt(4));

//			System.out.println("SELECT * FROM EMPLOYEE");
//			or
			System.out.println(String.format(SELECT_QUERY_BY_ID, id));

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return e;	}
	
@Override
	public void getAllEmplyee() {
		try {
			Statement  sts = conn.createStatement();
			
//			sts.executeQuery("SELECT*FROM Employee");

//			             OR
//			sts.executeQuery(String.format(SELECT_QUERY));

//			ResultSet rs = sts.executeQuery("select*from Employee");
//			             OR
			ResultSet rs = sts.executeQuery(String.format(SELECT_QUERY));

			while(rs.next()) {
				
		    	  int id=rs.getInt(1);
		    	  String name=rs.getString(2);
		    	  String gender=rs.getString(3);
		    	  int salary=rs.getInt(4);
//		    	  
		    	  
		    	  System.out.println("id = " + rs.getInt(1)+"\t name = " + rs.getString(2)+"\t gender =" + rs.getString(3) +"\t salary = " + rs.getInt(4) );
		    	  }
			 System.out.println(SELECT_QUERY);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}				
	}

@Override
public void printAllEmployees() {
	try(Statement statement = conn.createStatement();) {

		ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE");

		while (rs.next()) {
			System.out.println("ID = " + rs.getInt(1) + "\t NAME = " + rs.getString(2) + "\t GENDER = "
					+ rs.getString(3) + "\t SALARY = " + rs.getInt(4));
		}

		System.out.println("SELECT * FROM EMPLOYEE");
		
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
}



@Override
public Employee1 printEmployeeByName(String name) {
	Employee1 e = new Employee1();

	try (Statement statement = conn.createStatement();) {

		ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE NAME = '" + name + "'");

		while (rs.next()) {
			System.out.println("ID = " + rs.getInt(1) + "\t NAME = " + rs.getString(2) + "\t GENDER = "
					+ rs.getString(3) + "\t SALARY = " + rs.getInt(4));
		}

		System.out.println("SELECT * FROM EMPLOYEE");
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return e;
	
}














}
