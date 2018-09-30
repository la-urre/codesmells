package com.eteration.demo.codesmells.objectorientationabusers.temporaryfield.refactored;

public class RatingService {
	
	private CustomerService customerService;
	
	public void sendPromotionToCustomer(String customerId) {
		
		
		boolean isPremium = customerService.isPremiumCustomer(customerId);
		
		
		// main logic
		if(isPremium) {
			// premium customer offers
		}else{
			// normal customer offers
		}
		
		
		
		
	}
	

}
