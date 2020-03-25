package com.designpattern.demo.designPattern.bridge;

/**
 * @Description: Bridge
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
