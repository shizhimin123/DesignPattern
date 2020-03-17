package com.designpattern.demo.Controller.state;

/**
 * @Description: FullState
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class FullState implements DispenserState {
    @Override
    public void press() {
        System.out.println("Water is pouring!");
    }
}
