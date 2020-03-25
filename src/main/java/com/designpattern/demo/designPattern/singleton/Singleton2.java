package com.designpattern.demo.designPattern.singleton;

/**
 * @Description: Singleton2
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Singleton2 {

    /**
     * 内部类方法创建
     */
    private Singleton2() {
    }

    private static class holder{
        private static Singleton2 singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return holder.singleton2;
    }
}
