package com.designpattern.demo.Controller.visitor;

/**
 * @Description: MyVisitor
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
