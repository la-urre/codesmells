package com.eteration.demo.codesmells.bloaters.longparameterlist.refactored;

import com.eteration.demo.codesmells.bloaters.primitiveobsession.refactored.DateRange;

public class TransacitonQuery {
	
	private DateRange interval;
	private int lastTransactionCountLimit;
	private int accountNo;
	private String[] transactionTypeCodes;
	public DateRange getInterval() {
		return interval;
	}
	public void setInterval(DateRange interval) {
		this.interval = interval;
	}
	public int getLastTransactionCountLimit() {
		return lastTransactionCountLimit;
	}
	public void setLastTransactionCountLimit(int lastTransactionCountLimit) {
		this.lastTransactionCountLimit = lastTransactionCountLimit;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String[] getTransactionTypeCodes() {
		return transactionTypeCodes;
	}
	public void setTransactionTypeCodes(String[] transactionTypeCodes) {
		this.transactionTypeCodes = transactionTypeCodes;
	}

}
