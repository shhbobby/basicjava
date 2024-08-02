package create.factory;

public class BusFactory implements IFactory {
    @Override
    public ITransportation produce() {
        return new Car();
    }
}
