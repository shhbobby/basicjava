package structural.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class FlyFactory {
    private static final ConcurrentHashMap<String ,FlyWeight> datas = new ConcurrentHashMap<>();
    public static FlyWeight getFlyWeight(String type) {
        FlyWeight flyWeight = datas.get(type);
        if (flyWeight == null) {
            datas.put(type,flyWeight =new ConcreteFlyWeight1("sss"));
        }
        return flyWeight;
    }
}
