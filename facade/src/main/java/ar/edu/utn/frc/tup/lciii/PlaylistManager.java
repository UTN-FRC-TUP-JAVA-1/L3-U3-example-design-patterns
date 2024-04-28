package ar.edu.utn.frc.tup.lciii;

public class PlaylistManager {

    public void createPlaylist(String name) {
        System.out.println("Creating playlist: " + name);
    }

    public void addSongToPlaylist(String playlist, String song) {
        System.out.println("Adding song " + song + " to playlist " + playlist);
    }
}
