package com.designpattern.demo.designPattern.strategy;

/**
 * @Description: AdvancedMemberStrategy
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
