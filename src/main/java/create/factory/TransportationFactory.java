package create.factory;

public class TransportationFactory {
    //需要new Factory()
    //新建一个类型，都需要在这里修改代码
    public Boat createBoat() {
        return new Boat();
    }

    public Bus createBus() {
        return new Bus();
    }

    public Car createCar() {
        return new Car();
    }
}
