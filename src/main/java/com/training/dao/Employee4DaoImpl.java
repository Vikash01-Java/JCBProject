package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.entity.Employee4;

public class Employee4DaoImpl implements Employee4Dao{

	
	
	
	static Connection conn=null;
	
	static{
		try {
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","Root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	
	
	@Override
	public void saveEmployee(Employee4 s1,Employee4 s2) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("Insert into employee(id,name,age) value(?,?,?)");
		conn.setAutoCommit(false);
		ps.setInt(1, s1.getId());
		ps.setString(2, s1.getName());
		ps.setInt(3, s1.getAge());
		
		ps.executeUpdate();
		
		
		ps.setInt(1, s2.getId());
		ps.setString(2, s2.getName());
		ps.setInt(3, s2.getAge());
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("both insert seccsesfully");
		
		conn.rollback();
		System.out.println("insert error");
		
		conn.setAutoCommit(true);

	
	}

	@Override
	public void updateEmployee(Employee4 e) {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("Update employee set name=?,age=? where id =?");
			conn.setAutoCommit(false);
			
			ps.setString(1, e.getName());
			ps.setInt(2, e.getAge());
			ps.setInt(3, e.getId());
			
			ps.executeUpdate();
			conn.commit();
			System.out.println(" insert seccsesfully");
			
		} catch (SQLException ex) {
	        try {
	            conn.rollback(); // rollback only on failure
	            System.out.println("Update failed, rollback done!");
	        } catch (SQLException e2) {
	            e2.printStackTrace();
	        }
	        ex.printStackTrace();
	    } finally {
	        try {
	            conn.setAutoCommit(true); // reset autocommit
//	           
	        } catch (SQLException e3) {
	            e3.printStackTrace();
	        }
		
		
	}

	}

	@Override
	public void saveEmployee(Employee4 e) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("Insert into employee(id,name,age) value(?,?,?)");
		conn.setAutoCommit(false);
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setInt(3, e.getAge());
		
		ps.executeUpdate();
		
		
		conn.commit();
		System.out.println("insert seccsesfully");
		
		conn.rollback();
		System.out.println("insert error");
		
		conn.setAutoCommit(true);

	}

	@Override
	public void batchUpdate(Employee4 e) throws  SQLException{
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("Insert into employee(id,name,age) value(?,?,?)");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		conn.setAutoCommit(false);
		for(int i=0; i<=5; i++) {
			
		ps.setInt(1, e.getId()+i);
		ps.setString(2, e.getName());
		ps.setInt(3, e.getAge());
		ps.addBatch();
		
		if(i% 5==0) {
			ps.executeBatch();
			conn.commit();
		}
		}
	
		}

}
