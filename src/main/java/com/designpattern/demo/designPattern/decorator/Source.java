package com.designpattern.demo.designPattern.decorator;

/**
 * @Description: Source
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("方法一");
    }
}
