package com.designpattern.demo.designPattern.mediator;

/**
 * @Description: User1
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
