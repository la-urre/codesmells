package com.eteration.demo.codesmells.objectorientationabusers.switchstatements.refactored.alternative;

public class AccountService {
	
	
	public void notifyBalanceChange(int activeNotificationSystem) {
		
		switch (activeNotificationSystem) {
		case 1:
			sendSms();
			break;
		case 2:
			sendEmail();
			break;
		case 3:
			redirectToCallCenter();
			break;	
		default:
			break;
		}
		
	}

	private void redirectToCallCenter() {
		//redirect to callcenter logic  
		//redirect to callcenter logic  
		//redirect to callcenter logic  
		//redirect to callcenter logic  
		//redirect to callcenter logic  
		
	}

	private void sendEmail() {
		//send email logic
		//send email logic
		//send email logic
		//send email logic
		//send email logic		
	}

	private void sendSms() {
		
		//send sms logic
		//send sms logic
		//send sms logic
		//send sms logic
		//send sms logic
		
		
	}
	
}
