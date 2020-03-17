package com.designpattern.demo.Controller.visitor;

public interface Subject {

    public void accept(Visitor visitor);
    public String getSubject();
}
