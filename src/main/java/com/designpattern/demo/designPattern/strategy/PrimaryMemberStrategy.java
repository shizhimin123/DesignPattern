package com.designpattern.demo.designPattern.strategy;

/**
 * @Description: PrimaryMemberStrategy
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
