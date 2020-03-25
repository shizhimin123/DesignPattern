package com.designpattern.demo.designPattern.proxy.staticMethod;

/**
 * @Description: UserDao
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
