package com.designpattern.demo.Controller.build;

/**
 * @Description: Director
 * @Author: shizhimin
 * @Date: 2020/3/17
 * @Version: 1.0
 */
public class Director {

    private Builder builder = new ConcreteBuilder();
    public Product getAP(){
        builder.setPart("宝马","X7");
        return builder.getProduct();
    }

    public Product getBP(){
        builder.setPart("奥迪","Q5");
        return builder.getProduct();
    }


    /**
     * 创建者模式又叫建造者模式，是将一个复杂的对象的构建与它的表示分离，使
     * 得同样的构建过程可以创建不同的表示。创建者模式隐藏了复杂对象的创建过程，
     * 它把复杂对象的创建过程加以抽象，通过子类继承或者重载的方式，动态的创建具有复合属性的对象。
     *
     * 首先，建造者模式的封装性很好。使用建造者模式可以有效的封装变化，
     * 在使用建造者模式的场景中，一般产品类和建造者类是比较稳定的，因此，将主要的业务逻辑封装在导演类中对整体而言可以取得比较好的稳定性。
     * 其次，建造者模式很容易进行扩展。如果有新的需求，通过实现一个新的建造者类就可以完成，基本上不用修改之前已经测试通过的代码，因此也就不会对原有功能引入风险。
     * 总体上，建造者模式仅仅只比工厂模式多了一个“导演类”的角色。
     * 在建造者模式的类图中，假如把这个导演类看做是最终调用的客户端，那么图中剩余的部分就可以看作是一个简单的工厂模式了。
     *
     * 使用场景
     * 隔离复杂对象的创建和使用，相同的方法，不同执行顺序，产生不同事件结果
     * 多个部件都可以装配到一个对象中，但产生的运行结果不相同
     * 产品类非常复杂或者产品类因为调用顺序不同而产生不同作用
     * 初始化一个对象时，参数过多，或者很多参数具有默认值
     * Builder模式不适合创建差异性很大的产品类, 需要生成的产品对象有复杂的内部结构，这些产品对象具备共性；
     */
    public static void main(String[] args){
        Director director = new Director();

        Product product1 = director.getAP();
        product1.showProduct();

        Product product2 = director.getBP();
        product2.showProduct();
    }


}
