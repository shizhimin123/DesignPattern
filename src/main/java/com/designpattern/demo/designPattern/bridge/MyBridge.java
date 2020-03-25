package com.designpattern.demo.designPattern.bridge;

/**
 * @Description: MyBridge
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MyBridge extends Bridge {

    @Override
    public void method(){
        getSource().method();
    }

    /**
     * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化。
     * 就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。
     */
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
