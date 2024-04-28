package ar.edu.utn.frc.tup.lciii;

public class PlaybackState {

    private int position;
    private int volume;

    public PlaybackState(int position, int volume) {
        this.position = position;
        this.volume = volume;
    }

    public int getPosition() {
        return position;
    }

    public int getVolume() {
        return volume;
    }
}
