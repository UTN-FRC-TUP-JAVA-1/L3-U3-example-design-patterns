package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        // Reproducir archivo MP3
        MediaPlayer mp3Player = new MP3Player();
        mp3Player.play("song.mp3");

        // Adaptar la reproducción de archivos WAV usando el adaptador
        AdvancedMediaPlayer wavPlayer = new WAVPlayer();
        MediaPlayer wavAdapter = new WAVAdapter(wavPlayer);
        wavAdapter.play("song.wav");
    }
}
