package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.entity.Vehicle;

public class VehicleDaoImpl implements VehicleDao{
	public static final String UPDATE_QUERY = "UPDATE Car SET no=%d, name='%s', color='%s', price=%d WHERE no=%d";
	public static final String DELETE_QUERY = "DELETE FROM Car WHERE no=%d";
	public static final String select_query ="select * from Car";
	public static final String select_vec_by_no_query ="select * from Car where no = %d";


	static Connection connection=null;
	static {  
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vehicle","root","Root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void saveVehicle(Vehicle v) throws SQLException {
		Statement statement=connection.createStatement();
		
		statement.execute("INSERT INTO Car(no,name,color,price) VALUES ("
			    + v.getNo() + ",'" + v.getName() + "','" + v.getColor() + "'," + v.getPrice() + ")");

		System.out.println("INSERT INTO Car(no,name,color,price) VALUES (" + v.getNo() + "'"+ v.getName() + "','" + v.getColor() + "'," + v.getPrice() + ")");
		
	}

	@Override
	public void updateVehicle(Vehicle v)  {

		
		try {
			Statement statement= connection.createStatement();

			statement.execute(String.format(UPDATE_QUERY, 
	                v.getNo(), v.getName(), v.getColor(), v.getPrice(), v.getNo()));
			System.out.println(String.format(UPDATE_QUERY, 
	                v.getNo(), v.getName(), v.getColor(), v.getPrice(), v.getNo()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
	}

		
	

	@Override
	public void deleteVehicleByNo(int no) {
		try {
			Statement statement= connection.createStatement();

			statement.execute(String.format(DELETE_QUERY, no));
			System.out.println(String.format(DELETE_QUERY , no));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllVehicle() {
		try {
			Statement statement= connection.createStatement();

			statement.execute(String.format(select_query));
			ResultSet resultset=statement.executeQuery(select_query);
			while(resultset.next()) {
				System.out.println("NO="+resultset.getInt(1) +"NAME="+resultset.getString(2)+"COLOR="+resultset.getString(3)+"PRICE="+resultset.getInt(4));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		 
	

	@Override
	public Vehicle getVehicleBy(int no) {
		Vehicle vs = new Vehicle();
		try {
			Statement statement= connection.createStatement();

			statement.execute(String.format(select_vec_by_no_query,no));
			ResultSet rs = statement.executeQuery(String.format(select_vec_by_no_query,no));
			if(rs.next());
			vs.setNo(rs.getInt(1));
			vs.setName(rs.getString(2));
			vs.setColor(rs.getString(3));
			vs.setPrice(rs.getInt(4));
			System.out.println(String.format(select_vec_by_no_query,no));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vs;
		
	}
	
	
	

}
