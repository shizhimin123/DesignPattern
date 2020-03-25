package com.designpattern.demo.designPattern.memento;

/**
 * @Description: Memento
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Memento {
    private String value;


    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
