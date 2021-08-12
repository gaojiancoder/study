package com.kuang.service;

public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("增加了用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了用户");
    }

    @Override
    public void update() {
        System.out.println("改了用户");
    }

    @Override
    public void select() {
        System.out.println("查了用户");
    }
}
