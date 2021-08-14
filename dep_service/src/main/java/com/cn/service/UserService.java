package com.cn.service;

import com.cn.dao.UserDao;

/**
 * @author ryan
 * @create 2021-08-14 17:49
 */
public class UserService {
    public static void testService(){
        System.out.println("UserService Test...");
        //调用dep_dao模块的方法
        UserDao.testDao();
    }
}
