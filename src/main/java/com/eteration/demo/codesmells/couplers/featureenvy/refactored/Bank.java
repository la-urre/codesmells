package com.eteration.demo.codesmells.couplers.featureenvy.refactored;

import java.math.BigDecimal;

public class Bank {
	
	private long id;
	
	private BigDecimal balance;
	private String bankCode;
	private String countryCode;
	private String locationCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getBIC() {
		return bankCode + countryCode + locationCode;
	}
}
