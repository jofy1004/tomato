package com.tomato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@PropertySources({
        @PropertySource("classpath:config/jdbc.${spring.profiles.active}.properties"),
        @PropertySource("classpath:application.properties")
})
public class TomatoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomatoApplication.class, args);
    }

}

