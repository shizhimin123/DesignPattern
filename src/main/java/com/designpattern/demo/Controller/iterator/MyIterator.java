package com.designpattern.demo.Controller.iterator;

/**
 * @Description: MyIterator
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);
    }


    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }
    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }


    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
