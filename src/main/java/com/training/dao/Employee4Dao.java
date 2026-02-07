package com.training.dao;

import java.sql.SQLException;

import com.training.entity.Employee4;

public interface Employee4Dao {
	
public void saveEmployee(Employee4 e)throws SQLException;

public void updateEmployee(Employee4 e);

void saveEmployee(Employee4 s1, Employee4 s2) throws SQLException;

void batchUpdate(Employee4 e)throws  SQLException;


}
