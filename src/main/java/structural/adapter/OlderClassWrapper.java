package structural.adapter;

import common.OldClass;

public class OlderClassWrapper implements INewFunction {
    private OldClass olderClass;

    public OlderClassWrapper(OldClass olderClass) {
        this.olderClass = olderClass;
    }

    public OldClass getOlderClass() {
        return olderClass;
    }

    public void wrapperWork() {
        olderClass.work();
    }


    @Override
    public void doSomething() {
        olderClass.work();
    }

    @Override
    public void doSomethingNew() {
        System.out.println(" doSomethingNew ");
    }
}
