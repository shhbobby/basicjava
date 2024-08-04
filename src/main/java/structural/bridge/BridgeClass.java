package structural.bridge;

import common.IFunction;

public abstract class BridgeClass {
    private IFunction function;

    public IFunction getFunction() {
        return function;
    }

    public void setFunction(IFunction function) {
        this.function = function;
    }

}
