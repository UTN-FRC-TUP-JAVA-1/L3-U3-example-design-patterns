package ar.edu.utn.frc.tup.lciii;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
