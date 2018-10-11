package com.qiwei.smsverify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SmsverifyApplication {

    protected final static Logger logger = LoggerFactory.getLogger(SmsverifyApplication.class);

    /**
     * <p>
     * </p>
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SmsverifyApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
//		SpringApplication.run(SmsverifyApplication.class, args);
        logger.info("Application is success!");
    }
}
