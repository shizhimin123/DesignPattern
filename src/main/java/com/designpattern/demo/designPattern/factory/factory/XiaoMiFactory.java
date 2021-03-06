package com.designpattern.demo.designPattern.factory.factory;

import com.designpattern.demo.designPattern.factory.simple.MiPhone;
import com.designpattern.demo.designPattern.factory.simple.Phone;

/**
 * @Description: XiaoMiFactory
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public Pc makePc() {
        return new MiPc();
    }
}
