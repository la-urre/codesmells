package com.eteration.demo.codesmells.bloaters.primitiveobsession.smell;

import java.math.BigDecimal;
import java.util.Date;

public class EFTRequest {

	private String sourceAccountCustomerNumber;
	private String sourceAccountBranchNumber;
	private String sourceAccountSuffix;

	private String targetAccountCustomerNumber;
	private String targetAccountBranchNumber;
	private String targetAccountSuffix;

	private Date validDateFrom;

	private Date validDateTo;

	private BigDecimal amount;

	private String currency;

	public String getSourceAccountCustomerNumber() {
		return sourceAccountCustomerNumber;
	}

	public void setSourceAccountCustomerNumber(String sourceAccountCustomerNumber) {
		this.sourceAccountCustomerNumber = sourceAccountCustomerNumber;
	}

	public String getSourceAccountBranchNumber() {
		return sourceAccountBranchNumber;
	}

	public void setSourceAccountBranchNumber(String sourceAccountBranchNumber) {
		this.sourceAccountBranchNumber = sourceAccountBranchNumber;
	}

	public String getSourceAccountSuffix() {
		return sourceAccountSuffix;
	}

	public void setSourceAccountSuffix(String sourceAccountSuffix) {
		this.sourceAccountSuffix = sourceAccountSuffix;
	}

	public String getTargetAccountCustomerNumber() {
		return targetAccountCustomerNumber;
	}

	public void setTargetAccountCustomerNumber(String targetAccountCustomerNumber) {
		this.targetAccountCustomerNumber = targetAccountCustomerNumber;
	}

	public String getTargetAccountBranchNumber() {
		return targetAccountBranchNumber;
	}

	public void setTargetAccountBranchNumber(String targetAccountBranchNumber) {
		this.targetAccountBranchNumber = targetAccountBranchNumber;
	}

	public String getTargetAccountSuffix() {
		return targetAccountSuffix;
	}

	public void setTargetAccountSuffix(String targetAccountSuffix) {
		this.targetAccountSuffix = targetAccountSuffix;
	}

	public Date getValidDateFrom() {
		return validDateFrom;
	}

	public void setValidDateFrom(Date validDateFrom) {
		this.validDateFrom = validDateFrom;
	}

	public Date getValidDateTo() {
		return validDateTo;
	}

	public void setValidDateTo(Date validDateTo) {
		this.validDateTo = validDateTo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
	
	

}
