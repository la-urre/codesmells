package com.eteration.demo.codesmells.bloaters.longmethod.refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.eteration.demo.codesmells.bloaters.longmethod.TransactionRecord;

public class AccountService {

	private static final Logger LOGGER = Logger.getLogger(AccountService.class.getName());

	public void processDailyPaymentOrders() {
		List<String> records = processTranscationFile();
		List<TransactionRecord> txRecords = parseTransctionRecords(records);
		processTransactions(txRecords);
	}

	private void processTransactions(List<TransactionRecord> txRecords) {
		Connection conn = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			for (TransactionRecord transactionRecord : txRecords) {
				PreparedStatement stmt = conn.prepareStatement("INSERT INTO TRANSACTIONS values(? , ? , ? , ?)");
				stmt.setString(1, transactionRecord.getSourceAccountNumber());
				stmt.setString(2, transactionRecord.getTargetAccountNumber());
				stmt.setBigDecimal(3, transactionRecord.getAmout());
				stmt.setString(4, transactionRecord.getDescription());
				stmt.execute();
				stmt.close();
			}
			conn.commit();
		} catch (Exception e) {
			rollbackTransaction(conn, e);
		} finally {
			closeConnection(conn);
		}
	}

	private void rollbackTransaction(Connection conn, Exception e) {
		LOGGER.log(Level.SEVERE, "Rollback Process", e);

		try {
			if(conn != null) {
			conn.rollback();
			}
		} catch (SQLException e1) {
			LOGGER.log(Level.SEVERE, "Rollback error", e1);
		}
	}

	private void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "Connection close error", e);
			}
		}
	}

	private DataSource dataSource;

	private Connection getConnection() throws NamingException, SQLException {
		if (dataSource == null) {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			dataSource = (DataSource) envContext.lookup("jdbc/UsersDB");
		}
		return dataSource.getConnection();
	}

	private List<TransactionRecord> parseTransctionRecords(List<String> records) {
		List<TransactionRecord> txRecords = new ArrayList<>();

		for (String txRecordItem : records) {
			StringTokenizer st = new StringTokenizer(txRecordItem, ";");
			if (st.countTokens() == 4) {
				TransactionRecord txRecord = new TransactionRecord(st.nextToken(), st.nextToken(),
						new BigDecimal(st.nextToken()), st.nextToken());
				txRecords.add(txRecord);
			} else {
				LOGGER.log(Level.WARNING, "Invalid record {0}", txRecordItem);
			}
		}
		return txRecords;
	}

	private List<String> processTranscationFile() {
		String transactionFileName = "transactions.txt";
		BufferedReader reader = null;
		List<String> records = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader(transactionFileName));
			String line;
			while ((line = reader.readLine()) != null) {
				records.add(line);
			}
			reader.close();
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error occurred trying to read transaction file " + transactionFileName, e);
		} finally {
			closeReader(reader);
		}
		return records;
	}

	private void closeReader(BufferedReader reader) {
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "file reader close error", e);
			}
		}
	}

}
