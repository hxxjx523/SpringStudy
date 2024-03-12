package com.example.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("byeMyBean")
    public MyBean helloMyBean() {
        return new MyBean();
    }

}
