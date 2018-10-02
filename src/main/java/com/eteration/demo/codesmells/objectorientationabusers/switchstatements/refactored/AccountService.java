package com.eteration.demo.codesmells.objectorientationabusers.switchstatements.refactored;

public class AccountService {
	
	private NotificationService notificationService;
	
	public void notifyBalanceChange() {
		
		notificationService.sendNotification();
		
	}
	
}
