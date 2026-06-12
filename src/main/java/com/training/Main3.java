package com.training;

import java.sql.SQLException;

import com.training.dao.VehicleDao;
import com.training.dao.VehicleDaoImpl;
import com.training.entity.Vehicle;

public class Main3 {
    public static void main(String[] args) throws SQLException {
   
            VehicleDao dao = new VehicleDaoImpl();

    
//            Vehicle v = new Vehicle(5, "truk",  "red",500000);
//            dao.saveVehicle(v);
//            dao.updateVehicle(v);
//            dao.deleteVehicleByNo(5);
            
//            dao.getAllVehicle();
            
            Vehicle veh =dao.getVehicleBy(3);
            System.out.println(veh); 

            
            System.out.println("done");

      
    }
}