package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.training.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
//	createStatement().executeUpdate("insert into employee value(17,'Sweeti','female',70000)");
	
//	static Connection connection=null;
//	static {
//		
//		 try {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
//		 } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		 }
//		
//	}
//
//	@Override
//	public void saveEmployee(Employee e) throws SQLException {
//		
//		Statement  statement = connection.createStatement();
//		statement.executeUpdate("INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES ("+e.getId()+",'"+e.getName()+"','"+e.getGender()+"','"+e.getSalary()+"')");
//System.out.println("INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES ("+e.getId()+",'"+e.getName()+"','"+e.getGender()+"','"+e.getSalary()+"')");
//
//	}
//
//	@Override
//	public void updateEmployee(Employee e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteEmployeeById(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void getAllEmployee() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Employee getEmployeeBy(int id) {
//		return null;
//		// TODO Auto-generated method stub
//		
//	}
//
//}
	
	
	
	
	


	
//public static final String INSERT_QUERY ="INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES (%d,'%s','%s',%d)";
//public static final String UPDATE_QUERY ="UPDATE EMPLOYEE SET NAME= '%s', GENDER= '%s', SALARY= %d WHERE ID = %d ";
//
//	static Connection connection=null;
//	static {
//		
//		 try {
//			 
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
//		 } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		 }
//		
//	}
//
//
//	@Override
//	public void saveEmployee(Employee e) throws SQLException {
//		
//		Statement  statement = connection.createStatement();
//		statement.executeUpdate(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
//System.out.println(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
//statement.close();
//
//	}
//
//	@Override
//	public void updateEmployee(Employee e) {
//		
//		try {
//			Statement  statement = connection.createStatement();
//			System.out.println(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getId()));
//			
//			statement.executeUpdate(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getId()));
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//
//	}
//
//	@Override
//	public void deleteEmployeeById(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void getAllEmployee() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Employee getEmployeeBy(int id) {
//		return null;
//		// TODO Auto-generated method stub
//		
//	}
//
//}
	
	
	
	
//	public static final String INSERT_QUERY ="INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES (%d,'%s','%s',%d)";
//	public static final String UPDATE_QUERY ="UPDATE EMPLOYEE SET NAME= '%s', GENDER= '%s', SALARY= %d WHERE ID = %d ";
//	public static final String DELETE_QUERY ="DELETE FROM EMPLOYEE WHERE ID= %d ";
//
//	
//		static Connection connection=null;
//		static {
//			
//			 try {
//				 
//				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
//			 } catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			 }
//			
//		}
//	
//	
//		@Override
//		public void saveEmployee(Employee e) throws SQLException {
//			
//			Statement  statement = connection.createStatement();
//			statement.executeUpdate(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
//	System.out.println(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
//	statement.close();
//	
//		}
//	
//		@Override
//		public void updateEmployee(Employee e) {
//			
//			try {
//				Statement  statement = connection.createStatement();
//				
//				statement.executeUpdate(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getId()));
//	System.out.println(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getId()));

//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//	
//		}
//	
//		@Override
//		public void deleteEmployeeById(int id) {
//		
//			try {
//				Statement  statement = connection.createStatement();
//				
//				statement.executeUpdate(String.format(DELETE_QUERY, id));
//	System.out.println(String.format(DELETE_QUERY, id));

//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//		}
//	
//		@Override
//		public void getAllEmployee() {
//			// TODO Auto-generated method stub
//			
//		}
//	
//		@Override
//		public void getEmployeeBy(int id) {
//			// TODO Auto-generated method stub
//			
//		}
//	
//	}
	
	
	
	public static final String INSERT_QUERY ="INSERT INTO EMPLOYEE(ID,NAME,GENDER,SALARY) VALUES (%d,'%s','%s',%d)";
	public static final String UPDATE_QUERY ="UPDATE EMPLOYEE SET NAME= '%s', GENDER= '%s', SALARY= %d WHERE ID = %d";
	public static final String DELETE_QUERY ="DELETE FROM EMPLOYEE WHERE ID= %d ";
	public static final String SELECT_QUERY ="SELECT * FROM EMPLOYEE";
	public static final String SELECT_EMP_BY_ID_QUERY ="SELECT * FROM EMPLOYEE WHERE ID = %d";



	
		static Connection connection=null;
		static {
			
			 try {
				 
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Root");
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			
		}
	
	
		@Override
		public void saveEmployee(Employee e) throws SQLException {
			
			Statement  statement = connection.createStatement();
			statement.execute(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
	System.out.println(String.format(INSERT_QUERY, e.getId(),e.getName(),e.getGender(),e.getSalary() ));
	statement.close();
	
		}
	
		@Override
		public void updateEmployee(Employee e) {
			
			try (
				Statement  statement = connection.createStatement()){
				
				statement.execute(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getId()));
				System.out.println(String.format(UPDATE_QUERY, e.getName(),e.getGender(),e.getSalary(),e.getId()));

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	
		}
	
		@Override
		public void deleteEmployeeById(int id) {
		
			try (
				Statement  statement = connection.createStatement()){
				System.out.println(String.format(DELETE_QUERY, id));
				
				statement.execute(String.format(DELETE_QUERY, id));
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	
		@Override
		public void getAllEmployee() {
			try (
				Statement  statement = connection.createStatement()){
				
				statement.executeQuery(SELECT_QUERY);
				
				ResultSet resultSet=statement.executeQuery(SELECT_QUERY);
				while(resultSet.next())
				{
					System.out.println("ID = " + resultSet.getInt(1)+"\t Name = " + resultSet.getString(2)+"\t Gender =" + resultSet.getString(3)+"\tSalary = " + resultSet.getInt(4));
				}
					

				
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		
			
		}
	
		@Override
	public Employee getEmployeeBy(int id) {
			Employee e= new Employee();

			try (
				Statement  statement = connection.createStatement()){
				
//				statement.execute(SELECT_EMP_BY_ID_QUERY,id);

				ResultSet resultSet=statement.executeQuery(String.format(SELECT_EMP_BY_ID_QUERY,id));
				
				resultSet.next();
				
				e.setId(resultSet.getInt(1));
				e.setName(resultSet.getString(2));
				e.setGender(resultSet.getString(3));
				e.setSalary(resultSet.getInt(4));

				System.out.println(String.format(SELECT_EMP_BY_ID_QUERY,id));

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return e;
			
		}

		
	
	}


