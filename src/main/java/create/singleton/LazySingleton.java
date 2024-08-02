package create.singleton;

import java.io.Serializable;

//线程不安全，多线程进入if判断会多次new，并且赋值
public class LazySingleton implements Serializable {
    private static LazySingleton instance;

    private LazySingleton() {
        if (instance != null) {
            System.out.println();
            throw new RuntimeException("'LazySingleton' can only be initialized once");
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
