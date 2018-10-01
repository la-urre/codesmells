package com.eteration.demo.codesmells.changepreventers.shotgunsurgery.refactored;

public class RatingService {
	
	
	public void offerPromotion(Account account) {
		
		
		if(account.isPremiumCustomer()) {
			// premium customer, go with good offer
		}else {
			// standard customer, go with standard offer
		}
		
	}

}
