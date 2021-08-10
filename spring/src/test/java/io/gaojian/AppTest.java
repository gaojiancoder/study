package io.gaojian;

import static org.junit.Assert.assertTrue;

import io.gaojian.dao.UserDaoImpl;
import org.junit.Test;
import service.UserServiceImpl;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
         userService.getUser();
    }
}
