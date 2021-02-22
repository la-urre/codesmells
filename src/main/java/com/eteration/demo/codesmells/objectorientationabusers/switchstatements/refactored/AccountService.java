package com.eteration.demo.codesmells.objectorientationabusers.switchstatements.refactored;

public class AccountService {
	private final NotificationService notificationService;

	public AccountService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void notifyBalanceChange() {
		notificationService.sendNotification();
	}
	
}
