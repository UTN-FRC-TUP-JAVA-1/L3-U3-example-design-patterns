package ar.edu.utn.frc.tup.lciii;

/**
 * Template Method Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        SongPlayer player1 = new MP3Player(true);
        player1.play("song1.mp3");

        SongPlayer player2 = new WAVPlayer(false);
        player2.play("song2.wav");
    }
}
