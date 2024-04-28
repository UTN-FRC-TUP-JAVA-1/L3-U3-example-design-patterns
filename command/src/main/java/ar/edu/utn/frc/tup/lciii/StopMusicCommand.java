package ar.edu.utn.frc.tup.lciii;

public class StopMusicCommand implements MusicCommand {

    private final MusicPlayer musicPlayer;

    public StopMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop();
    }
}
