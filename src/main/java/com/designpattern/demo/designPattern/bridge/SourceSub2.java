package com.designpattern.demo.designPattern.bridge;

/**
 * @Description: SourceSub2
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
