package service;

import io.gaojian.dao.UserDao;
import io.gaojian.dao.UserDaoImpl;

public class UserServiceImpl {
    private UserDao userDao =new UserDaoImpl();
    public void getUser(){
        userDao.getUser();
    }
}
