package com.designpattern.demo.Controller.memento;

/**
 * @Description: Original
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Original {
    private String value;

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public Original(String value) {
        this.value = value;
    }


    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }

}
