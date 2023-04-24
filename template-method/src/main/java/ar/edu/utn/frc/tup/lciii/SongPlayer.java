package ar.edu.utn.frc.tup.lciii;

public abstract class SongPlayer {

    public final void play(String filename) {
        decode(filename);
        if (isPlayingAllowed()) {
            openPlayer();
            startPlayer();
        }
        else {
            System.out.println("Playing not allowed");
        }
        closePlayer();
    }

    protected abstract void decode(String filename);

    protected abstract boolean isPlayingAllowed();

    protected void openPlayer() {
        System.out.println("Player opened");
    }

    protected abstract void startPlayer();

    protected void closePlayer() {
        System.out.println("Player closed");
    }
}
