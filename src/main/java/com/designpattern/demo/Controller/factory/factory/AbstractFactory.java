package com.designpattern.demo.Controller.factory.factory;

import com.designpattern.demo.Controller.factory.simple.Phone;

public interface AbstractFactory {
    Phone makePhone();
    Pc makePc();
}
