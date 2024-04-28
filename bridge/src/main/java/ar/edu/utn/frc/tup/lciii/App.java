package ar.edu.utn.frc.tup.lciii;

/**
 * Bridge Pattern
 */
public class App 
{
    public static void main( String[] args )
    {

        MusicPlayer windowsMusicPlayer = new WindowsMusicPlayer(new WindowsPlayer());
        MusicPlayer macMusicPlayer = new MacMusicPlayer(new MacPlayer());

        windowsMusicPlayer.play();
        windowsMusicPlayer.pause();
        windowsMusicPlayer.stop();

        macMusicPlayer.play();
        macMusicPlayer.pause();
        macMusicPlayer.stop();
    }
}
