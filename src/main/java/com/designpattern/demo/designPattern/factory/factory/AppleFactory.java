package com.designpattern.demo.designPattern.factory.factory;

import com.designpattern.demo.designPattern.factory.simple.IPhone;
import com.designpattern.demo.designPattern.factory.simple.Phone;

/**
 * @Description: AppleFactory
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public Pc makePc() {
        return new MAC();
    }
}
