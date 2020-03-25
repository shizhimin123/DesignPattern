package com.designpattern.demo.designPattern.state;

/**
 * 核心思想就是：当对象的状态改变时，同时改变其行为。
 * 主要解决的是当控制一个对象状态转换的条件表达式过于复杂的情况。
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化
 *
 * 将于特定状态相关的行为局部化，并且将不同状态的行为分割开来，将特定的状态相关的行为都放入一个对象中，由于所有状态相关的代码都存在于某个concreteState中，所以通过定义新的子类可以很容易的增加新的状态和转换
 * 状态模式通过把各个状态转移逻辑分布到State的子类中，来减少相互依赖
 * 当一个对象的行为取决于状态，并且它必须在运行时根据状态改变它的行为，就可以考虑使用状态模式
 */
public class WaterDispenser {
    private static int capacity = 20;
    private static DispenserState dispenserState;


    public WaterDispenser(DispenserState state) {
        dispenserState = state;
    }


    private static void setState(DispenserState state) {
        dispenserState = state;
    }


    public DispenserState getState() {
        return dispenserState;
    }


    public void press() {
        capacity--;
        if (capacity <= 0) {
            setState(new NullState());
        }
        dispenserState.press();
    }

    public static void main(String[] args) {
        WaterDispenser dispenser = new WaterDispenser(new FullState());
        for (int i = 0; i < 100; ++i) {
            dispenser.press();
        }
    }

}
