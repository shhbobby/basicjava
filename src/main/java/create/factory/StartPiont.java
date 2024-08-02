package create.factory;

public class StartPiont {
    public static void main(String[] args) {
        TransportationFactory factory = new TransportationFactory();
        factory.createBus().move();

        try {
            TransportationSimpleFactory factorySimple = new TransportationSimpleFactory();
            factorySimple.createTransportation("Bus").move();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        TransportationStaticFactory.createBus().move();
        new BusFactory().produce().move();
    }
}
