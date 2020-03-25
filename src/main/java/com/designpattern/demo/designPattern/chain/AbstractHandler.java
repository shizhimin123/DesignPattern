package com.designpattern.demo.designPattern.chain;

/**
 * @Description: AbstractHandler
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public abstract class AbstractHandler {
    private Handler handler;


    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
