package structural.bridge;

public class MyBridge extends BridgeClass {

    public void workBridge() {
        getFunction().work();
    }


    public void doSomethingBridge() {
        getFunction().doSomething();
    }
}
