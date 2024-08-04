package structural.flyweight;

public class ConcreteFlyWeight2 extends FlyWeight {
    private String color;
    public ConcreteFlyWeight2(String outSide,String color) {
        super(outSide);
        this.color = color;
    }

    @Override
    public void operation() {
        System.out.println("");

    }
}
