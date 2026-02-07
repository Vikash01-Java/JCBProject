package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
   
	public static void main(String[] args) throws SQLException {
		

		
		
		
		
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student2","root","Root");
//		
//		
//		Statement statement=connection.createStatement();
//		
//		statement.executeQuery("select*from recored");
//		
//		      ResultSet rs = statement.executeQuery("select*from recored");
//		      
//		      while(rs.next()) {
//		    	  int id=rs.getInt(1);
//		    	  String name=rs.getString(2);
//		    	  String gender=rs.getString(3);
//		    	  int age=rs.getInt(4);
//		    	  int marks=rs.getInt(5);
//		    	  
//		    	  System.out.println("id = " + rs.getInt(1)+"\t name = " + rs.getString(2)+"\t gender =" + rs.getString(3) +"\t age = " + rs.getInt(4) +"\t marks = " + rs.getInt(5));
//		    	  
//		    
//
//
//		      }
//	connection.close();
//	}
//}
		
//		Question: Write a query to fetch student details whose id = 4
				
//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student2","root","Root");
//		
//		
//		Statement statement=connection.createStatement();
//		
//		statement.executeQuery("select*from recored where id=4");
//		
//		      ResultSet rs = statement.executeQuery("select*from recored where id=4");
//		      
//		      while(rs.next()) {
//		    	  int id=rs.getInt(1);
//		    	  String name=rs.getString(2);
//		    	  String gender=rs.getString(3);
//		    	  int age=rs.getInt(4);
//		    	  int marks=rs.getInt(5);
//		    	  
//		    	  System.out.println("id = " + rs.getInt(1)+"\t name = " + rs.getString(2)+"\t gender =" + rs.getString(3) +"\t age = " + rs.getInt(4) +"\t marks = " + rs.getInt(5));
//		    	  
//		    
//		      }
//		
//		
//connection.close();
//
//	}
//	}
	
//		Question: Fetch all students who scored more than 60 marks.
		
//	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student2","root","Root");
//	
//	
//	Statement statement=connection.createStatement();
//	
//	statement.executeQuery("select*from recored where marks>60");
//	
//	      ResultSet rs = statement.executeQuery("select*from recored where marks>60");
//	      
//	      while(rs.next()) {
//	    	  int id=rs.getInt(1);
//	    	  String name=rs.getString(2);
//	    	  String gender=rs.getString(3);
//	    	  int age=rs.getInt(4);
//	    	  int marks=rs.getInt(5);
//	    	  
//	    	  System.out.println("id = " + rs.getInt(1)+"\t name = " + rs.getString(2)+"\t gender =" + rs.getString(3) +"\t age = " + rs.getInt(4) +"\t marks = " + rs.getInt(5));
//	    	  
//	    
//	      }
//	
//	
//connection.close();
//	}
//}

//		Count Students	
		
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student2","root","Root");
//		
//		
//		Statement statement=connection.createStatement();
//		
//		statement.executeQuery("select count(*) from recored ");
//		
//		      ResultSet rs = statement.executeQuery("select count(*) from recored ");
//		      
//		      if(rs.next()) {
//		    	  int count=rs.getInt(1);
//		    	  
//		    	  
//		    	  System.out.println("Total number of students = " + count);
//		    	  
//		    
//		      }
//		
//		
//	connection.close();
		}
	}
