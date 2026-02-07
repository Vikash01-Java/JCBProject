package com.training.dao;

import java.sql.SQLException;

import com.training.entity.Vehicle;

public interface VehicleDao {
public void saveVehicle(Vehicle v)throws SQLException;
	
	public void updateVehicle(Vehicle v);
	
	public void deleteVehicleByNo(int no);
	
	public void getAllVehicle();
	
	public Vehicle getVehicleBy(int no);

	
}
