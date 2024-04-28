package ar.edu.utn.frc.tup.lciii;


/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Playable song = new Song("Imagine", "John Lennon");

        Playable songWithVolume = new VolumeDecorator(song, 50);

        Playable songWithVolumeAndEqualization = new EqualizerDecorator(songWithVolume, "Rock");

        songWithVolume.play();

        System.out.println("====================================");
        songWithVolumeAndEqualization.play();
    }
}
