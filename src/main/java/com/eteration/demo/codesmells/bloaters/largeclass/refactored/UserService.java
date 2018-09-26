package com.eteration.demo.codesmells.bloaters.largeclass.refactored;

public class UserService extends BaseJDBCService{
	
	private NotificationService notificationService = new NotificationService();

	public void updatePassword() {
		
		SecurityUtils.hasUserAccess(TransactionType.UPDATE_PASWORD);

		// validate inputs/query

		getConnection();

		// perform operation

		notificationService.sendNotification();
		
		cleanupConnection();

	}

	public void resetPassword() {
		
		SecurityUtils.hasUserAccess(TransactionType.RESET_PASWORD);

		// validate inputs/query

		getConnection();

		// perform operation

		notificationService.sendNotification();
		
		cleanupConnection();

	}

}
