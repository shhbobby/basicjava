package structural.proxy;

import common.IFunction;
import common.OldClass;

public class ProxyClass implements IFunction {
    private OldClass oldClass;

    public ProxyClass(OldClass oldClass) {
        this.oldClass = new OldClass();
    }

    @Override
    public void work() {
        oldClass.work();
    }

    @Override
    public void doSomething() {
        oldClass.doSomething();
    }
}
