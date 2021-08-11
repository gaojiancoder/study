package io.gaojian;

import io.gaojian.config.gaoConfig;
import io.gaojian.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(gaoConfig.class);
        User getUser = context.getBean("getUser",User.class);
        System.out.println(getUser.getName());
    }
}
