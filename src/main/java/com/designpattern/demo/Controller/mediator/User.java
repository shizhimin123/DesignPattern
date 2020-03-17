package com.designpattern.demo.Controller.mediator;

/**
 * @Description: User
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
