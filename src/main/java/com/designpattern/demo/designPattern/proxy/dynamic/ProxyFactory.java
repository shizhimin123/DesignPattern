package com.designpattern.demo.designPattern.proxy.dynamic;

import com.designpattern.demo.designPattern.proxy.staticMethod.IUserDao;
import com.designpattern.demo.designPattern.proxy.staticMethod.UserDao;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Description: ProxyFactory
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class ProxyFactory {

    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                }
        );
    }

    /**
     * 代理对象不需要实现接口, 但是目标对象要实现接口
     */
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }
}
