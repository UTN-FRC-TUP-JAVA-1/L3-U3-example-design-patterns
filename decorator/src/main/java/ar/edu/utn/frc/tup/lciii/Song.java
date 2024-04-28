package ar.edu.utn.frc.tup.lciii;

public class Song implements Playable {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + title + " from " + artist);
    }
}
