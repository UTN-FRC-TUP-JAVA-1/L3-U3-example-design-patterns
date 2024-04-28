package ar.edu.utn.frc.tup.lciii;

public class PauseMusicCommand implements MusicCommand {

    private final MusicPlayer musicPlayer;

    public PauseMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.pause();
    }
}
