 package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.entity.Student;

public class StudentDaoImpl implements StudentDao{
	public static final String insert_query="insert into person(id,name,gender) value (%d,'%s','%s')";
	public static final String update_query="update person set name = '%s', gender = '%s' where id =%d";
	public static final String delete_query="delete from person where id = %d";
	public static final String select_query ="select * from person";
	public static final String select_per_by_id_query ="select * from person where id = %d";
	

	static Connection connection=null;
	static {
		  try {
			  connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","Root");
		  } catch (SQLException e) {
			
			e.printStackTrace();
		  }
	}


	@Override
	public void saveStudent(Student s) throws SQLException {
		Statement stat=connection.createStatement();
		stat.executeUpdate(String.format(insert_query,s.getId(),s.getName(),s.getGender()));
		System.out.println(String.format(insert_query,s.getId(),s.getName(),s.getGender()));
		
	}

	@Override
	public void updateStudent(Student s) {
		try {
			Statement stat=connection.createStatement();
			stat.executeUpdate(String.format(update_query,s.getName(),s.getGender(),s.getId()));
			System.out.println(String.format(update_query,s.getName(),s.getGender(),s.getId()));

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
	}

	@Override
	public void deleteStudentById(int id) {
		try {
			Statement stat=connection.createStatement();
		
			stat.executeUpdate( String.format(delete_query, id));
			System.out.println(String.format(delete_query, id));

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllStudent() {
	
		
			try {
				Statement stat=connection.createStatement();
			
				stat.executeQuery( String.format(select_query));
				ResultSet rs = stat.executeQuery(select_query);
				while(rs.next()) {

					System.out.println("id = " + rs.getInt(1)+"\t name = " + rs.getString(2)+"\t gender =" + rs.getString(3));	
				}
//				

				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}
	@Override
	public Student getStudentById(int id) {
		Student st= new Student();
		try {
			Statement stat=connection.createStatement();
		
			stat.executeQuery( String.format(select_per_by_id_query,id));
			ResultSet rs = stat.executeQuery(String.format(select_per_by_id_query,id));
			rs.next();
			st.setId(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setGender(rs.getString(3));
			
			System.out.println(String.format(select_per_by_id_query,id));
				
			
//			

			
		} catch (SQLException s) {
			
			s.printStackTrace();
		}
		return st;
		
	}

	
	@Override
	public void createTable(String name) {
		
		
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		
	}

	

	

}
