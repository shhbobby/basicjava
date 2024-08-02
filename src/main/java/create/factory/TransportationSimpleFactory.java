package create.factory;

public class TransportationSimpleFactory {
    //需要new Factory()
    //新建一个类型，都需要在这里修改代码
    //找不到type会报错
    public ITransportation createTransportation(String type) throws Exception {
        switch (type) {
            case "Boat":
                return new Boat();
            case "Car":
                return new Car();
            case "Bus":
                return new Bus();
            default:
                throw new Exception("not find type");

        }
    }
}
