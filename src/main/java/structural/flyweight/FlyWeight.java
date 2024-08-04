package structural.flyweight;

public abstract class FlyWeight {
    private  String name;
    private String color;

    protected String outSide;

    public FlyWeight(String outSide) {
        this.outSide = outSide;
    }
    public abstract void operation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
