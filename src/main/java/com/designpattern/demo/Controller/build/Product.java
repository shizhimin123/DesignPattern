package com.designpattern.demo.Controller.build;

/**
 * @Description: Product
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Product {
    private String name;
    private String type;

    public void showProduct(){
        System.out.println("名称："+name);
        System.out.println("型号："+type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
