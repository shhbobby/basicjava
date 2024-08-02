package create.singleton;

import java.io.Serializable;

public class LazySingletonDCL implements Serializable {
    //DCL的关键volatile 变量的可见性和禁止了指令重排序
    //双重检查锁定模式需要谨慎实现，以避免因编译器优化等原因导致的错误
    private static volatile  LazySingletonDCL instance;

    private LazySingletonDCL() {
        if (instance != null) {
            System.out.println();
            throw new RuntimeException("'LazySingleton' can only be initialized once");
        }
    }

    public static  LazySingletonDCL getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDCL.class)
            {
                if (instance == null) {
                    instance = new LazySingletonDCL();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
