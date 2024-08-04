package structural.flyweight;

public class ConcreteFlyWeight1 extends FlyWeight {
    public ConcreteFlyWeight1(String outSide) {
        super(outSide);
    }

    @Override
    public void operation() {
        System.out.println("");

    }
}
