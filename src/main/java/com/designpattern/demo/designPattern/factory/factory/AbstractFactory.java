package com.designpattern.demo.designPattern.factory.factory;

import com.designpattern.demo.designPattern.factory.simple.Phone;

public interface AbstractFactory {
    Phone makePhone();
    Pc makePc();
}
