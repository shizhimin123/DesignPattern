package com.designpattern.demo.Controller.factory.simple;

/**
 * @Description: IPhone
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class IPhone implements Phone {

    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产苹果手机");
    }
}
