package com.designpattern.demo.Controller.mediator;

/**
 * @Description: User2
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class User2 extends User {


    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
