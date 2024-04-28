package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        PlaybackController playbackController = new PlaybackController();
        PlayerUI playerUI = new PlayerUI(playbackController);
        playbackController.play();
        playbackController.pause();
    }
}
