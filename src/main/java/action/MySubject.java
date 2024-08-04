package action;

import javax.security.auth.Subject;
import java.util.EventListener;

public class MySubject extends AbstractSubject{
    @Override
    public void doSomething() {
        System.out.println(" doSomething");
        notifyObservers();
    }
}
