package com.eteration.demo.codesmells.bloaters.longmethod;

import java.math.BigDecimal;

public class TransactionRecord {
	
	private String sourceAccountNumber;
	private String targetAccountNumber;
	private BigDecimal amout;
	private String description;
	
	
	
	
	
	public TransactionRecord(String sourceAccountNumber, String targetAccountNumber, BigDecimal amout,
			String description) {
		super();
		this.sourceAccountNumber = sourceAccountNumber;
		this.targetAccountNumber = targetAccountNumber;
		this.amout = amout;
		this.description = description;
	}
	public String getSourceAccountNumber() {
		return sourceAccountNumber;
	}
	public void setSourceAccountNumber(String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}
	public String getTargetAccountNumber() {
		return targetAccountNumber;
	}
	public void setTargetAccountNumber(String targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}
	public BigDecimal getAmout() {
		return amout;
	}
	public void setAmout(BigDecimal amout) {
		this.amout = amout;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
