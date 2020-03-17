package com.designpattern.demo.Controller.template;

/**
 * @Description: Plus
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Plus extends AbstractCalculator{
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，
     * 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用,
     * 模板方法模式是典型的面向抽象编程，在抽象阶段将系统的不变部分（如步骤顺序）确定下来，变化部分（如步骤具体内容）交给子类。
     */
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
