package com.designpattern.demo.designPattern.factory.simple;

/**
 * @Description: MiPhone
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MiPhone implements Phone {

    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产小米手机");
    }
}
