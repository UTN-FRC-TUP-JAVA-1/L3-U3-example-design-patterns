package ar.edu.utn.frc.tup.lciii;

public class PlayerUI implements Observer {

    private PlaybackController playbackController;

    public PlayerUI(PlaybackController playbackController) {
        this.playbackController = playbackController;
        playbackController.addObserver(this);
    }

    @Override
    public void update() {
        if (playbackController.isPlaying()) {
            System.out.println("Displaying playing state in UI");
        } else {
            System.out.println("Displaying paused state in UI");
        }
    }
}
