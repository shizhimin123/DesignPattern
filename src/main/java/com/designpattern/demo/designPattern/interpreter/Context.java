package com.designpattern.demo.designPattern.interpreter;

/**
 * @Description: Context
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Context {

    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
     * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
     */
    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
