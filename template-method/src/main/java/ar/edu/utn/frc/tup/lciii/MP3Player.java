package ar.edu.utn.frc.tup.lciii;

public class MP3Player extends SongPlayer {

    private boolean allowed;

    public MP3Player(boolean allowed) {
        this.allowed = allowed;
    }

    protected void decode(String filename) {
        System.out.println("Decoding MP3 file: " + filename);
    }

    protected boolean isPlayingAllowed() {
        return allowed;
    }

    protected void startPlayer() {
        System.out.println("Playing MP3 file");
    }
}
