package com.hackerrank.configstyles.service;

public class SmsNotificationService implements NotificationService {
    private final String serviceName;

    public SmsNotificationService(String serviceName) {
        this.serviceName = serviceName;
    }

    public ServiceResponse sendNotification(String notification) {
        return new ServiceResponse(serviceName, notification);
    }
}
