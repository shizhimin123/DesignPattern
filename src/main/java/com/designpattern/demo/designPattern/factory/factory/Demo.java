package com.designpattern.demo.designPattern.factory.factory;

/**
 * @Description: Demo
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Demo {

    /**
     * 实例化实现类, 调用接口方法
     * 如果发生修改  不利于维护
     * 是创建单个类的模式
     * Spring中最常用的BeanFactory实现是XmlBeanFactory类。
     * 工厂类就是提供了一个Map，根据一个特定的key值，找一个特定的Bean
     */
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();
        miFactory.makePc();
        appleFactory.makePhone();
        appleFactory.makePc();
    }
}
