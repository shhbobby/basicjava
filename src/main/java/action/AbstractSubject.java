package action;

import javax.security.auth.Subject;
import java.util.Vector;

public class AbstractSubject implements ISubject {
    private Vector<IObserver> vector = new Vector<>();

    @Override
    public void add(IObserver observer) {
        vector.addElement(observer);
    }

    @Override
    public void remove(IObserver observer) {
        vector.removeElement(observer);
    }

    @Override
    public void notifyObservers() {
        while (vector.elements().hasMoreElements()) {
            vector.elements().nextElement().update();
        }
    }

    @Override
    public void doSomething() {

    }
}
