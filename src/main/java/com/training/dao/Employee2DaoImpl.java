package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.entity.Employee1;

public class Employee2DaoImpl implements Employee1Dao {

	private static Connection conn=null;
	
	public static final String INSERT_QUERY ="INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES (?,?,?,?)";
	public static final String UPDATE_QUERY ="UPDATE EMPLOYEE SET NAME=?, GENDER=?, SALARY=? WHERE ID=?";
	public static final String DELETE_QUERY ="DELETE FROM EMPLOYEE WHERE ID=?";
	public static final String SELECT_QUERY ="SELECT*FROM EMPLOYEE";
	public static final String SELECT_QUERY_BY_ID = "SELECT id, name, gender, salary FROM employee WHERE id=?";
	public static final String SELECT_QUERY_BY_NAME ="SELECT*FROM EMPLOYEE WHERE NAME= ?";




	

	static {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void saveEmployee(Employee1 e) throws SQLException    {
		
      PreparedStatement ps = conn.prepareStatement(INSERT_QUERY);
      ps.setInt(1, e.getId());
      ps.setString(2, e.getName());
      ps.setString(3, e.getGender());
      ps.setInt(4, e.getSalary());
      int rows = ps.executeUpdate();
      System.out.println(rows + " record(s) inserted successfully.");	
        }

	
	@Override
	public void updateEmployee(Employee1 e) {
		 try {
			PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
			ps.setInt(1, e.getId());
		      ps.setString(2, e.getName());
		      ps.setString(3, e.getGender());
		      ps.setInt(4, e.getSalary());
		      int rows = ps.executeUpdate();
		      System.out.println(rows + " record(s) Updated successfully.");
		 } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		 }
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		try {
			PreparedStatement ps = conn.prepareStatement(DELETE_QUERY);
			ps.setInt(1, id); // parameter set karna zaroori hai
		      int rows = ps.executeUpdate();
		      System.out.println(rows + " record(s) Deleted successfully.");
		 } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		 }		
	}

	@Override
	public void getAllEmplyee() {
		try (PreparedStatement ps = conn.prepareStatement(SELECT_QUERY)) {
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int id = rs.getInt("ID");
	            String name = rs.getString("NAME");
	            String gender = rs.getString("GENDER");
	            int salary = rs.getInt("SALARY");

	            System.out.println("ID = " + id +  "\t NAME = " + name +  "\t GENDER = " + gender +  "\t SALARY = " + salary);
	        }
	    } catch (SQLException e1) {
	        e1.printStackTrace();       
	    }		
	}
	@Override
	public Employee1 getEmployeeById(int id) {
		Employee1 e = null;

		try (PreparedStatement ps = conn.prepareStatement(SELECT_QUERY_BY_ID)) {
	        ps.setInt(1, id);  // parameter set karna zaroori hai
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            e = new Employee1();
	            e.setId(rs.getInt(1));
	            e.setName(rs.getString(2));
	            e.setGender(rs.getString(3));
	            e.setSalary(rs.getInt(4));
	        }

	        System.out.println("Executed Query: SELECT * FROM EMPLOYEE WHERE ID=" + id);

	    } catch (SQLException e1) {
	        e1.printStackTrace();
	    }

		return e;
	}

	@Override
	public Employee1 printEmployeeByName(String name) {
		Employee1 e = new Employee1();

		try (PreparedStatement ps = conn.prepareStatement(SELECT_QUERY_BY_NAME)) {
	        ps.setString(1, name);  // parameter set karna zaroori hai
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            e = new Employee1();
	            e.setId(rs.getInt(1));
	            e.setName(rs.getString(2));
	            e.setGender(rs.getString(3));
	            e.setSalary(rs.getInt(4));
	        }

	        System.out.println("Executed Query: SELECT * FROM EMPLOYEE WHERE NAME=" + name);

	    } catch (SQLException e1) {
	        e1.printStackTrace();
	    }

		return e;		
	}
	@Override
	public void printAllEmployees() {
		try (PreparedStatement ps = conn.prepareStatement(SELECT_QUERY)) {
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int id = rs.getInt("ID");
	            String name = rs.getString("NAME");
	            String gender = rs.getString("GENDER");
	            int salary = rs.getInt("SALARY");

	            System.out.println("ID = " + id +  "\t NAME = " + name +  "\t GENDER = " + gender +  "\t SALARY = " + salary);
	        }
	    } catch (SQLException e1) {
	        e1.printStackTrace();
	    }			
	}


	

	
	

}
