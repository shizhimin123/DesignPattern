package com.designpattern.demo.designPattern.factory.factory;

/**
 * @Description: MAC
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MAC implements Pc {
    public MAC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产Mac");
    }
}
