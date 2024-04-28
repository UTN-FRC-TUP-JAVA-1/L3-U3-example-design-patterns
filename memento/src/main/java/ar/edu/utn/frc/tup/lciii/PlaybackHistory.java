package ar.edu.utn.frc.tup.lciii;

public class PlaybackHistory {

    private PlaybackState memento;

    // Método para guardar el estado de reproducción actual como un memento
    public void saveState(PlaybackState memento) {
        this.memento = memento;
    }

    // Método para obtener el último memento guardado
    public PlaybackState restoreState() {
        return memento;
    }
}
