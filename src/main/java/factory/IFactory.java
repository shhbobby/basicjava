package factory;

public interface IFactory {
    //把需要的类型放在同一个工厂里面来做
    ITransportation produce();
}
