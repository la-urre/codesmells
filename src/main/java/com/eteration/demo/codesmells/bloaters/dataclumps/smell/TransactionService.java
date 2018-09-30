package com.eteration.demo.codesmells.bloaters.dataclumps.smell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class TransactionService {

	public void creditCardTransactions(Date startDate, Date endDate, int limit) throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}
		String URL = "jdbc:oracle:thin:username/password@amrood:1521:EMP";
		Connection conn = DriverManager.getConnection(URL);
		
		
		// query creditcard transactions with connection

	}

	public void accountCardTransactions(Date startDate, Date endDate, int limit) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}
		String URL = "jdbc:oracle:thin:username/password@amrood:1521:EMP";
		Connection conn = DriverManager.getConnection(URL);
		
		
		// query account transactions with connection
	}

}
