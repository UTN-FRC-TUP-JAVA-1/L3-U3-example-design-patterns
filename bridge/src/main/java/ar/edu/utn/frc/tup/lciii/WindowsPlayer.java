package ar.edu.utn.frc.tup.lciii;

public class WindowsPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Windows Player: Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Windows Player: Pausing music");
    }

    @Override
    public void stop() {
        System.out.println("Windows Player: Stopping music");
    }
}
