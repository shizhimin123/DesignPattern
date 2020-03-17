package com.designpattern.demo.Controller.command;

/**
 * @Description: MyCommand
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void exe() {
        receiver.action();
    }
}
