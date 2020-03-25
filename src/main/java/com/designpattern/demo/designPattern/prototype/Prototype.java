package com.designpattern.demo.designPattern.prototype;

import java.io.*;

/**
 * 使用场景
 * 1.在需要一个类的大量对象的时候，使用原型模式是最佳选择，因为原型模式是在内存中对这个对象进行拷贝，要比直接new这个对象性能要好很多，
 * 在这种情况下，需要的对象越多，原型模式体现出的优点越明显。
 *
 * 2.如果一个对象的初始化需要很多其他对象的数据准备或其他资源的繁琐计算，那么可以使用原型模式。
 *
 * 3.当需要一个对象的大量公共信息，少量字段进行个性化设置的时候，也可以使用原型模式拷贝出现有对象的副本进行加工处理。
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String string;
    private Serializable obj;

    /**
     * 浅复制  将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /**
     * 深复制
     * 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
     * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);


        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
