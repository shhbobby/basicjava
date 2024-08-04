package common;

import java.io.Serializable;

public class NewClass implements IFunction{
    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
}
