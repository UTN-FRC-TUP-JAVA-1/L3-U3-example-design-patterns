package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Cloneable {

    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    // Implementación del método clone para clonar una lista de reproducción
    @Override
    public Playlist clone() {
        Playlist clone = new Playlist(this.name + "_Copy");
        for (Song song : this.songs) {
            clone.addSong(song.clone()); // Clonar cada canción y agregarla a la lista clonada
        }
        return clone;
    }

    public void displaySongs() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            System.out.println(" - " + song.getTitle() + " by " + song.getArtist());
        }
    }
}
