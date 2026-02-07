package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.entity.Employee1;

public class Employee3DaoImpl implements Employee1Dao{
	
//Transaction
	
	private static Connection conn=null;
	static {
		 try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Root");
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	}
	@Override
	public void saveEmployee(Employee1 e)  {
		PreparedStatement ps=null;

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement("INSERT INTO worker(name, gender, salary) VALUES(?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getGender());
			ps.setInt(3, e.getSalary());
			
			ps.executeUpdate();
			
			
//			ps.setString(1, e.getName());
//			ps.setString(2, e.getGender());
//			ps.setInt(3, e.getSalary());
//			
//			ps.executeUpdate();
			conn.commit();
			System.out.println("employee insert succesfully");
		} catch (SQLException e1) {
			try {
				conn.rollback();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			e1.printStackTrace();
		}finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	
		
	}

	
	@Override
	public void updateEmployee(Employee1 e) {
		try {
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement("UPDATE worker SET NAME=?, GENDER=?, SALARY=? WHERE ID=?");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getGender());
			ps.setInt(4, e.getSalary());
			
			ps.executeUpdate();
			conn.commit();
			
			System.out.println("worker update succesfully");

		} catch (SQLException e1) {
              try {
				conn.rollback();
			  } catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			  }
			e1.printStackTrace();
		}finally {
			try {
				conn.setAutoCommit(true);
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	@Override
	public void deleteEmployeeById(int id) {
	    try {
	        conn.setAutoCommit(false);

	        PreparedStatement ps = conn.prepareStatement("DELETE FROM WORKER WHERE ID=?");
	        ps.setInt(1, id);

	        int rows = ps.executeUpdate();
	        conn.commit();

	        if (rows > 0) {
	            System.out.println("Worker with ID " + id + " deleted successfully.");
	        } else {
	            System.out.println("No worker found with ID " + id);
	        }

	    } catch (SQLException e) {
	        try { conn.rollback(); } catch (SQLException e1) { e1.printStackTrace(); }
	        e.printStackTrace();
	    } finally {
	    
	        try { conn.setAutoCommit(true); } catch (SQLException e) { e.printStackTrace(); }
	    }
	}

	
	@Override
	public Employee1 getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void printAllEmployees() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getAllEmplyee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employee1 printEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
