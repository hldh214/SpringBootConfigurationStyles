package com.hackerrank.configstyles.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
class EmailConf {
    @Bean
    public String serviceName() {
        return "EMAIL_SERVICE";
    }
}


@Component
public class EmailNotificationService implements NotificationService {
    private final String serviceName;

    public EmailNotificationService(String serviceName) {
        this.serviceName = serviceName;
    }

    public ServiceResponse sendNotification(String notification) {
        return new ServiceResponse(serviceName, notification);
    }

}
