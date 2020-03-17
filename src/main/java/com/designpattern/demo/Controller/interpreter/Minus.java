package com.designpattern.demo.Controller.interpreter;

/**
 * @Description: Minus
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Minus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
