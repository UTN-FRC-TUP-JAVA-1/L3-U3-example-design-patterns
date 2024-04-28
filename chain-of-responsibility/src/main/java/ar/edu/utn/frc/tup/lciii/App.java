package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Chain Of Responsibility Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        // Configuración de la cadena de responsabilidad para aplicar los efectos de sonido
        SoundEffectHandler equalizerHandler = new EqualizerHandler();
        SoundEffectHandler reverbHandler = new ReverbHandler();
        SoundEffectHandler volumeHandler = new VolumeHandler();

        equalizerHandler.setNextHandler(reverbHandler);
        reverbHandler.setNextHandler(volumeHandler);

        // Simulación de aplicar efectos de sonido a una canción
        Song song = new Song("My Song");
        equalizerHandler.applyEffect(song);
    }
}
