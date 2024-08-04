package structural.bridge;

import common.IFunction;
import structural.adapter.NewClass1;

public class NewClass2 implements IFunction {
    @Override
    public void work() {
        System.out.println("NewClass2 works");
    }

    @Override
    public void doSomething() {
        System.out.println("NewClass2 doSomething");
    }
}
