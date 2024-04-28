package ar.edu.utn.frc.tup.lciii;

public class VolumeDecorator extends SongDecorator {

    private int volumeLevel;

    public VolumeDecorator(Playable song, int volumeLevel) {
        super(song);
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        System.out.println("Applying volume adjustment: " + volumeLevel);
        super.play();
    }
}
