package ar.edu.utn.frc.tup.lciii;

public class Song {

    private String title;

    public Song(String title) {
        this.title = title;
    }

    // Método para crear un memento con el estado actual de reproducción
    public PlaybackState createPlaybackState() {
        // En este ejemplo, simplemente se devuelve un nuevo objeto PlaybackState con la posición y el volumen actuales
        return new PlaybackState(0, 50); // Supongamos que la canción está en la posición 0 y el volumen es 50
    }

    // Método para restaurar el estado de reproducción desde un memento
    public void restorePlaybackState(PlaybackState state) {
        // En este ejemplo, se restaura la posición y el volumen de reproducción desde el memento proporcionado
        System.out.println("Restoring playback state for song: " + title);
        System.out.println("Position: " + state.getPosition() + ", Volume: " + state.getVolume());
    }
}
