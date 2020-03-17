package com.designpattern.demo.Controller.flyweight;

/**
 * @Description: ConcreteFlyweight
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     */
    public ConcreteFlyweight(Character state){
        this.intrinsicState = state;
    }


    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }

}
