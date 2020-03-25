package com.designpattern.demo.designPattern.interpreter;


/**
 * @Description: Plus
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Plus implements Expression {


    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
