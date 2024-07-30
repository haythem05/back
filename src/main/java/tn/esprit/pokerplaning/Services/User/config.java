package tn.esprit.pokerplaning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Conditional;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Value("${MAIL_ENABLED:false}")
    private boolean mailEnabled;

    @Bean
    public JavaMailSender javaMailSender() {
        if (mailEnabled) {
            return new JavaMailSenderImpl();
        }
        return null;
    }
}
