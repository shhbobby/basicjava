package factory;

public class Bus implements ITransportation {
    @Override
    public void move() {
        System.out.println(this.getClass().getName() +" move");
    }

    @Override
    public void open() {
        System.out.println(this.getClass().getName() +" open");
    }

    @Override
    public void stop() {

    }
}
