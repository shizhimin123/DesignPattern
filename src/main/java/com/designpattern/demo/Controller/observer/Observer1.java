package com.designpattern.demo.Controller.observer;

/**
 * @Description: Observer1
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
