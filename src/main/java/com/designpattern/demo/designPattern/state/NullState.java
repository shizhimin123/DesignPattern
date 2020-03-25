package com.designpattern.demo.designPattern.state;

/**
 * @Description: NullState
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class NullState implements DispenserState {
    @Override
    public void press() {
        System.out.println("There is not water poured!");
    }
}
