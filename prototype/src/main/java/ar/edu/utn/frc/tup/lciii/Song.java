package ar.edu.utn.frc.tup.lciii;

public class Song implements Cloneable {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Implementación del método clone para clonar una canción
    @Override
    public Song clone() {
        return new Song(this.title, this.artist);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
