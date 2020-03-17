package com.designpattern.demo.Controller.singleton;

/**
 * @Description: Singleton
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Singleton {
    /**
     * 饿汉式加载  线程安全,但是消耗不必要的资源
     */
    //private static Singleton singleton = new Singleton();


    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile  Singleton singleton = null;

    private Singleton() {
    }

    /**
     * 懒汉式加载 但是多线程中不适用
     */
    /*public static Singleton getInstance(){
        if (null == singleton){
            singleton = new Singleton();
        }
        return singleton;
    }*/

    /**
     * 懒汉式加载 线程安全
     */
    public static Singleton getInstance(){
        if (null == singleton){
            synchronized (singleton){
                if (null == singleton){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


}
