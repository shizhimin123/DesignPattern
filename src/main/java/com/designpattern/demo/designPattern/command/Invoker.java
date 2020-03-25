package com.designpattern.demo.designPattern.command;

/**
 * @Description: Invoker
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }


    public void action(){
        command.exe();
    }

    /**
     * Invoker是调用者（司令员），Receiver是被调用者（士兵），MyCommand是命令，实现了Command接口，持有接收对象
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
