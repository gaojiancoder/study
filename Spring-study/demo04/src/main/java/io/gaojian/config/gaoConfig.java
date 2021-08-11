package io.gaojian.config;

import io.gaojian.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gaoConfig {
    @Bean

    public User getUser(){
        return new User();
    }

}
