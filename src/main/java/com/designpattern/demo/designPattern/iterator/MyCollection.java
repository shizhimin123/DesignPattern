package com.designpattern.demo.designPattern.iterator;

/**
 * @Description: MyCollection
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }


    @Override
    public Object get(int i) {
        return string[i];
    }


    @Override
    public int size() {
        return string.length;
    }

}
