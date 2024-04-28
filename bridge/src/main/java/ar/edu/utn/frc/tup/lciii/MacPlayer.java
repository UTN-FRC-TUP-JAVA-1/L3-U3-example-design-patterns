package ar.edu.utn.frc.tup.lciii;

public class MacPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Mac Player: Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Mac Player: Pausing music");
    }

    @Override
    public void stop() {
        System.out.println("Mac Player: Stopping music");
    }
}
