package com.designpattern.demo.Controller.build;

/**
 * @Description: Builder
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public abstract class Builder {
    public abstract void setPart(String arg1, String arg2);
    public abstract Product getProduct();
}
