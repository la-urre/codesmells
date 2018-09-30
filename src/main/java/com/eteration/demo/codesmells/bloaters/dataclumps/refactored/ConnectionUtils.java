package com.eteration.demo.codesmells.bloaters.dataclumps.refactored;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}
		String URL = "jdbc:oracle:thin:username/password@amrood:1521:EMP";
		Connection conn = DriverManager.getConnection(URL);
		return conn;
	}

}
