package factory;

public class CarFactory implements IFactory {

    @Override
    public ITransportation produce() {
        return new Car();
    }
}
