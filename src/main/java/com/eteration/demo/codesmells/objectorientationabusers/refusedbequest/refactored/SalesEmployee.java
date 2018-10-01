package com.eteration.demo.codesmells.objectorientationabusers.refusedbequest.refactored;

import java.math.BigDecimal;
import java.util.List;

import com.eteration.demo.codesmells.objectorientationabusers.refusedbequest.Product;

public class SalesEmployee extends Employee {
	//states and behavours spesific to sales employye

	
	private BigDecimal yearlyQuota;
	private List<Product> products;
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
