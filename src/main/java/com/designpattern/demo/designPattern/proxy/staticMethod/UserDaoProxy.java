package com.designpattern.demo.designPattern.proxy.staticMethod;

/**
 * @Description: UserDaoProxy
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class UserDaoProxy implements IUserDao {
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }

    /**
     * 代理对象和被代理对象都实现同一个接口 ,并代理对象接收被代理对象的实例 ,进行扩展被代理对象的方法
     */
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        //执行的是代理的方法
        proxy.save();
    }
}
