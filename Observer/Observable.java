package Observer;

import java.util.List;

public interface Observable {
    void addObserver(Observer observer);
    boolean notifyObservers();
}
