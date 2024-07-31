package singleton;

import java.io.Serializable;

//效率低，每次getInstance都要lock
public class LazySingleton2 implements Serializable {
    private static LazySingleton2 instance;

    private LazySingleton2() {
        if (instance != null) {
            System.out.println();
            throw new RuntimeException("'LazySingleton' can only be initialized once");
        }
    }

    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
