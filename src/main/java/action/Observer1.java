package action;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements IObserver {
    @Override
    public void update() {
        System.out.println("");
    }
}
