package com.eteration.demo.codesmells.objectorientationabusers.switchstatements.smell;

public class AccountService {
	
	
	public void notifyBalanceChange(int activeNotificationSystem) {
		
		switch (activeNotificationSystem) {
		case 1:
			//send sms logic
			//send sms logic
			//send sms logic
			//send sms logic
			//send sms logic
			break;
		case 2:
			//send email logic
			//send email logic
			//send email logic
			//send email logic
			//send email logic
			break;
		case 3:
			//redirect to callcenter logic  
			//redirect to callcenter logic  
			//redirect to callcenter logic  
			//redirect to callcenter logic  
			//redirect to callcenter logic  
			break;	
		default:
			break;
		}
		
	}
	
}
