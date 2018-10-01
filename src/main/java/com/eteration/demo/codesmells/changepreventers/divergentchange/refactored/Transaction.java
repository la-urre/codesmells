package com.eteration.demo.codesmells.changepreventers.divergentchange.refactored;

import java.util.Date;

public class Transaction {
	
	private long id;
	private Date txDate;
	private String explanation;

	private TransactionJSONSerializer transactionJSONSerializer;
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Date getTxDate() {
		return txDate;
	}



	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}



	public String getExplanation() {
		return explanation;
	}



	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}



	public String toJSON() {
		return transactionJSONSerializer.parse(this);
	}
	
}
