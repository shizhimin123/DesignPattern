package com.designpattern.demo.Controller.build;

/**
 * @Description: ConcreteBuilder
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
