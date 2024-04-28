package ar.edu.utn.frc.tup.lciii;

public abstract class SongDecorator implements Playable {

    protected Playable song;

    public SongDecorator(Playable song) {
        this.song = song;
    }

    @Override
    public void play() {
        song.play();
    }
}
