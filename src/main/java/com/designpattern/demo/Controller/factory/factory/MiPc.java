package com.designpattern.demo.Controller.factory.factory;

/**
 * @Description: MiPc
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MiPc implements Pc {

    public MiPc() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产小米PC");
    }
}
