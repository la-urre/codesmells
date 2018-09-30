package com.eteration.demo.codesmells.bloaters.dataclumps.refactored;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionService {

	public void creditCardTransactions(TransactionQuery transactionQuery) throws SQLException {

		Connection conn = ConnectionUtils.getConnection();

		// query creditcard transactions with connection

	}

	public void accountCardTransactions(TransactionQuery transactionQuery) throws SQLException {

		Connection conn = ConnectionUtils.getConnection();

		// query account transactions with connection
	}

}
