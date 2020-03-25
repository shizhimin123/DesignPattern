package com.designpattern.demo.designPattern.observer;

/**
 * @Description: MySubject
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();

    }


    /**
     * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
     * 这个主题对象在状态上发生变化时，会通知所有观察者对象，让他们能够自动更新自己
     */
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
