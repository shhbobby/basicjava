package structural.decorator;

import common.IFunction;

public class Decorator implements IFunction {
    private IFunction function;

    public Decorator(IFunction function) {
        this.function = function;
    }

    @Override
    public void work() {
        //do something
        function.work();
        //do something
    }

    @Override
    public void doSomething() {
//do something
        //可以没有这个函数的功能

        function.doSomething();
        //do something
    }
}
