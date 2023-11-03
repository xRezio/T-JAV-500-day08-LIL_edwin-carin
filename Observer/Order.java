package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String position;
    private String destination;
    private int timeBeforeArrival;

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }

    public void setData(String position, String destination, int timeBeforeArrival) {
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = timeBeforeArrival;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean notifyObservers() {
        observers.forEach(observer -> observer.update(this));
        return !this.observers.isEmpty();
    }
}
