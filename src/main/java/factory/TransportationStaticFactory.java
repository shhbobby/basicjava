package factory;

public class TransportationStaticFactory {
    public static Car createCar() {
        return new Car();
    }

    public static Bus createBus() {
        return new Bus();
    }

    public static Boat createBoat() {
        return new Boat();
    }
}
