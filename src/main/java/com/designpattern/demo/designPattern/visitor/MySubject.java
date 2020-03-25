package com.designpattern.demo.designPattern.visitor;

/**
 * @Description: MySubject
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
