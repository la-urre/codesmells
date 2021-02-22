package com.eteration.demo.codesmells.objectorientationabusers.temporaryfield.refactored;

import java.math.BigDecimal;

public class RatingService {
	
	public void sendPromotionToCustomer(String customerId) {
		BigDecimal totalBalance;
		int monthlyTransactionCount;
		boolean isPremium = false;
		//complex logic for customer segmentation based on these fields

		// main logic
		if(isPremium) {
			// premium customer offers for 18+ age
			int age = getCustomerAge();
			// proceed with age
		}else{
			// normal customer offers
		}
	}

	private int getCustomerAge() {
		return 20;// TODO
	}
	

}
