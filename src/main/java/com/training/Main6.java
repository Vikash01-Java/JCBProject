package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.dao.Employee4Dao;
import com.training.dao.Employee4DaoImpl;
import com.training.entity.Employee1;
import com.training.entity.Employee4;

public class Main6 {

	public static void main(String[] args) throws SQLException {

		
		Employee4Dao dao = new Employee4DaoImpl();
//		Employee4 s1 = new Employee4(2,"mohan",30);
//		Employee4 s2 = new Employee4(3,"mohini",24);
		
//		Employee4 s3 = new Employee4(1,"sohan",31);


		
//		dao.saveEmployee(s1);
//		dao.saveEmployee(s2);
//		dao.updateEmployee(s3);
		
		Employee4 s3 = new Employee4(5,"sohan",31);
		dao.batchUpdate(s3);
//==================================================================
//Transaction All queries 
//            Connection conn = null;
//		    PreparedStatement insertStmt = null;
//	        PreparedStatement updateStmt = null;
//	        PreparedStatement deleteStmt = null;
//	        Statement selectStmt = null;
//	        ResultSet rs = null;
//
//	        try {
//	            // 1️⃣ Connect to Database
//	            conn = DriverManager.getConnection(
//	                    "jdbc:mysql://localhost:3306/testdb", "root", "password");
//
//	            // 2️⃣ Disable Auto-commit => Begin Transaction
//	            conn.setAutoCommit(false);
//
//	            // 3️⃣ INSERT query
//	            insertStmt = conn.prepareStatement("INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)");
//	            insertStmt.setInt(1, 101);
//	            insertStmt.setString(2, "Vikas");
//	            insertStmt.setDouble(3, 50000);
//	            insertStmt.executeUpdate();
//	            System.out.println("✅ Record inserted");
//
//	            // 4️⃣ UPDATE query
//	            updateStmt = conn.prepareStatement("UPDATE employee SET salary = salary + 5000 WHERE id = ?");
//	            updateStmt.setInt(1, 101);
//	            updateStmt.executeUpdate();
//	            System.out.println("✅ Salary updated");
//
//	            // 5️⃣ DELETE query
//	            deleteStmt = conn.prepareStatement("DELETE FROM employee WHERE id = ?");
//	            deleteStmt.setInt(1, 102); // example: deleting another record
//	            deleteStmt.executeUpdate();
//	            System.out.println("✅ Record deleted (if existed)");
//
//	            // 6️⃣ SELECT query
//	            selectStmt = conn.createStatement();
//	            rs = selectStmt.executeQuery("SELECT * FROM employee");
//
//	            System.out.println("\n📋 Current Employee Table:");
//	            while (rs.next()) {
//	                System.out.println("ID = " + rs.getInt("id") +
//	                                   ", Name = " + rs.getString("name") +
//	                                   ", Salary = " + rs.getDouble("salary"));
//	            }
//
//	            // 7️⃣ Commit the transaction if all succeed
//	            conn.commit();
//	            System.out.println("\n🎉 Transaction committed successfully!");
//
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//
//	            // 8️⃣ Rollback on error
//	            try {
//	                if (conn != null) {
//	                    conn.rollback();
//	                    System.out.println("⚠️ Transaction rolled back due to error!");
//	                }
//	            } catch (SQLException ex) {
//	                ex.printStackTrace();
//	            }
//	        } finally {
//	            // 9️⃣ Close all resources
//	            try {
//	                if (rs != null) rs.close();
//	                if (insertStmt != null) insertStmt.close();
//	                if (updateStmt != null) updateStmt.close();
//	                if (deleteStmt != null) deleteStmt.close();
//	                if (selectStmt != null) selectStmt.close();
//	                if (conn != null) conn.close();
//	            } catch (SQLException e) {
//	                e.printStackTrace();
//	            }
//		
//
//	}

}
}
