package com.designpattern.demo.Controller.factory.simple;

/**
 * @Description: FuShiKangFactory
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class FuShiKangFactory {

    public Phone makePhone(String phoneType){
        if ("MiPhone".equalsIgnoreCase(phoneType)){
            return new MiPhone();
        }else if ("IPhone".equalsIgnoreCase(phoneType)){
            return new IPhone();
        }
        return null;
    }

    /**
     * 向工厂传递类型来创建指定要的对象
     */
    public static void main(String[] arg) {
        FuShiKangFactory factory = new FuShiKangFactory();
        Phone miPhone = factory.makePhone("MiPhone");
        IPhone iPhone = (IPhone)factory.makePhone("iPhone");
    }
}
