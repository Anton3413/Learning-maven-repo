package com.test.service;

import com.test.dao.UserDao;
import com.test.service.service.UserService;

public class AppRunner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UserDao userDao = new UserDao();

        System.out.println(userDao.findById(5L));
    }
}
