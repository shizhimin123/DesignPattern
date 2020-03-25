package com.designpattern.demo.designPattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description: AbstractSubject
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }


    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }


    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

}
