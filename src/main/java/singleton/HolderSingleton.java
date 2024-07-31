package singleton;

import java.io.Serializable;

public class HolderSingleton implements Serializable {
    //关键静态类，饿汉
    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    private HolderSingleton() {
        if(Holder.INSTANCE != null) {
            throw new RuntimeException("HolderSingleton already instantiated");
        }
    }

    //被调用时才会实例化
    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private Object readResolve() {
        return Holder.INSTANCE;
    }
}
