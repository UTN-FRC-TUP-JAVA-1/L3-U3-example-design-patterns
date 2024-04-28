package ar.edu.utn.frc.tup.lciii;


/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        // Crear una instancia de la fachada del reproductor de música
        MusicPlayerFacade musicPlayerFacade = new MusicPlayerFacade();

        // Utilizar la fachada para reproducir una canción
        musicPlayerFacade.playSong("Imagine");

        // Utilizar la fachada para aplicar ajustes de ecualización y volumen
        musicPlayerFacade.applyEqualizerSetting("Rock");
        musicPlayerFacade.adjustVolume(70);

        // Utilizar la fachada para crear una lista de reproducción y agregar una canción
        musicPlayerFacade.createPlaylist("My Playlist");
        musicPlayerFacade.addSongToPlaylist("My Playlist", "Bohemian Rhapsody");

        // Detener la canción
        musicPlayerFacade.stopSong();
    }
}
