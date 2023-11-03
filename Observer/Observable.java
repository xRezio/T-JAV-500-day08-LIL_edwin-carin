package Observer;

public interface Observable {

    public void addObserver(Observer observer);

    public boolean notifyObservers();

}
