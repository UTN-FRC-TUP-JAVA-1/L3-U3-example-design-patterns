package ar.edu.utn.frc.tup.lciii;


import java.util.ArrayList;
import java.util.List;

public class PlaybackController implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private boolean playing;

    public void play() {
        playing = true;
        notifyObservers(); // Notificar a los observadores que el estado de reproducción ha cambiado
    }

    public void pause() {
        playing = false;
        notifyObservers(); // Notificar a los observadores que el estado de reproducción ha cambiado
    }

    public boolean isPlaying() {
        return playing;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
