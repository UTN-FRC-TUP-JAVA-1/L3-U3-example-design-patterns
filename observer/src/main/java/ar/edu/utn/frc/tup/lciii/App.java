package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {

        /*
        En este ejemplo:
        - `PlaybackController` actúa como el sujeto observable. Implementa la interfaz `Observable` y
        mantiene una lista de observadores (`PlayerUI` en este caso). Tiene métodos para iniciar y pausar la
        reproducción, y notifica a los observadores cuando cambia el estado de reproducción.

        - `PlayerUI` representa un componente interesado en el estado de reproducción. Implementa la interfaz
        `Observer` y actualiza la interfaz de usuario según el estado de reproducción recibido del `PlaybackController`.

        - En el método `main`, creamos instancias del `PlaybackController` y del `PlayerUI`, y luego simulamos
        iniciar y pausar la reproducción. Cada vez que cambia el estado de reproducción, el `PlaybackController`
        notifica a los observadores (en este caso, solo el `PlayerUI`) y este último actualiza la interfaz de usuario en consecuencia.
         */
        PlaybackController playbackController = new PlaybackController();
        PlayerUI playerUI = new PlayerUI(playbackController);
        playbackController.play();
        playbackController.pause();
    }
}
