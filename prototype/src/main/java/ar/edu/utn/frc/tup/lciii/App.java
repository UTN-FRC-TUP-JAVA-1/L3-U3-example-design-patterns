package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Song originalSong = new Song("Imagine", "John Lennon");

        Playlist originalPlaylist = new Playlist("Favorites");
        originalPlaylist.addSong(originalSong);

        Playlist clonedPlaylist = originalPlaylist.clone();

        originalPlaylist.displaySongs();

        clonedPlaylist.displaySongs();
    }
}
