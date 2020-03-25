package com.designpattern.demo.designPattern.strategy;

/**
 * @Description: IntermediateMemberStrategy
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
