package structural.adapter;

import common.OldClass;

public class AdapterOld extends OldClass implements INewFunction{


    public static void main(String[] args) {
        AdapterOld adapter = new AdapterOld();
        adapter.doSomething();
        adapter.doSomethingNew();
    }

    @Override
    public void doSomething() {
        super.work();
    }

    @Override
    public void doSomethingNew() {
        System.out.println(" doSomethingNew");
    }
}
