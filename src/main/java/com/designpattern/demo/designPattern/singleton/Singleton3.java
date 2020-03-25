package com.designpattern.demo.designPattern.singleton;

/**
 * @Description: Singleton3
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Singleton3 {

    private static Singleton3 singleton3;
    /**
     * 线程内部的存储类，可以在指定线程内存储数据，数据存储以后，只有指定线程可以得到存储数据
     */
    private static ThreadLocal<Singleton3> threadLocal = new ThreadLocal<Singleton3>();

    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        if (null == threadLocal.get()){
            synchronized (Singleton3.class){
                if (null == singleton3){
                    singleton3 = new Singleton3();
                }
            }
            threadLocal.set(singleton3);
        }
        return threadLocal.get();
    }

}
