package create.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    //private final static HungrySingleton instance = new HungrySingleton();
    private final static HungrySingleton instance ;
    static  {
        instance = new HungrySingleton();
    }
    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("HungrySingleton already instantiated");
        }
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
    private Object readResolve(){
        return instance;
    }
}
