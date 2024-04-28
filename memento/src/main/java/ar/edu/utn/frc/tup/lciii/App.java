package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Chain Of Responsibility Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Song song = new Song("My Song");

        PlaybackHistory history = new PlaybackHistory();

        PlaybackState currentState = song.createPlaybackState();
        history.saveState(currentState);

        // Simulamos cambiar el estado de reproducción
        // En un reproductor de música real, esto podría ser el resultado de la interacción del usuario
        // Por ejemplo, el usuario adelanta la canción, ajusta el volumen, etc.
        currentState = new PlaybackState(120, 70); // Supongamos que la canción está ahora en la posición 120 y el volumen es 70
        history.saveState(currentState);

        // Simulamos restaurar el estado de reproducción desde el último memento guardado
        PlaybackState restoredState = history.restoreState();
        song.restorePlaybackState(restoredState);
    }
}
