package com.designpattern.demo.Controller.observer;

/**
 * @Description: Observer2
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
