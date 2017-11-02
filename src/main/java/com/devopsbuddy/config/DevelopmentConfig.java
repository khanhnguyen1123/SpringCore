package com.devopsbuddy.config;
 
 import com.devopsbuddy.backend.service.EmailService;
 import com.devopsbuddy.backend.service.MockEmailService;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.context.annotation.Profile;
 import org.springframework.context.annotation.PropertySource;
 
 /**
  * Created by tedonema on 21/03/2016.
  * file:src/main/resources/message.properties
  * file:///${user.home}/.devopsbuddy/application-dev.properties
  */
 @Configuration
 @Profile("dev")
 @PropertySource("file:src/main/resources/application-dev.properties")
 public class DevelopmentConfig {
 
     @Bean
     public EmailService emailService() {
         return new MockEmailService();
     }
 }