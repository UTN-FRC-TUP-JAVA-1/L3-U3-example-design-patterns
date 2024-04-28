package ar.edu.utn.frc.tup.lciii;

public class PlayMusicCommand implements MusicCommand {

        private final MusicPlayer musicPlayer;

        public PlayMusicCommand(MusicPlayer musicPlayer) {
            this.musicPlayer = musicPlayer;
        }

        @Override
        public void execute() {
            musicPlayer.play();
        }
}
