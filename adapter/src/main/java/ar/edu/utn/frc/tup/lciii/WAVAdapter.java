package ar.edu.utn.frc.tup.lciii;

public class WAVAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public WAVAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String filename) {
        advancedMediaPlayer.playWAV(filename);
    }
}
