package com.eteration.demo.codesmells.changepreventers.shotgunsurgery.smell;

public class RatingService {
	
	
	public void offerPromotion(Account account) {
		
		
		if(account.getBalance().doubleValue()>500) {
			// premium customer, go with good offer
		}else  {
			// standard customer, go with standard offer
		}
		
	}

}
