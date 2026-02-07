package com.training.dao;

import java.sql.SQLException;

import com.training.entity.Student;

public interface StudentDao {
	
public void saveStudent(Student s)throws SQLException;
	
	public void updateStudent(Student s);
	
	public void deleteStudentById(int id);
	
	public void getAllStudent();
	
	public Student getStudentById(int id);
	
	public void createTable(String name);

	public void update(Student s);
	
}
