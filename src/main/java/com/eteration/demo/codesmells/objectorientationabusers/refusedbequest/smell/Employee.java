package com.eteration.demo.codesmells.objectorientationabusers.refusedbequest.smell;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.eteration.demo.codesmells.objectorientationabusers.refusedbequest.Product;

public class Employee {
	
	private long id;
	private String name;
	private Date birthDate;
	private BigDecimal yearlyQuota;
	private List<Product> products;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public BigDecimal getYearlyQuota() {
		return yearlyQuota;
	}
	public void setYearlyQuota(BigDecimal yearlyQuota) {
		this.yearlyQuota = yearlyQuota;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	} 
	
}
