package action;

public interface ISubject {
    void  add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
    void doSomething();
}
