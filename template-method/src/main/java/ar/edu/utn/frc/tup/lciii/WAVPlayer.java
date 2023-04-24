package ar.edu.utn.frc.tup.lciii;

public class WAVPlayer extends SongPlayer {

    private boolean allowed;

    public WAVPlayer(boolean allowed) {
        this.allowed = allowed;
    }

    protected void decode(String filename) {
        System.out.println("Decoding WAV file: " + filename);
    }

    protected boolean isPlayingAllowed() {
        return allowed;
    }

    protected void startPlayer() {
        System.out.println("Playing WAV file");
    }
}
