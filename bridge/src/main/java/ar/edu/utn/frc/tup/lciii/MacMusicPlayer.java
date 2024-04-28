package ar.edu.utn.frc.tup.lciii;

public class MacMusicPlayer extends MusicPlayer {

    public MacMusicPlayer(Player player) {
        super(player);
    }

    @Override
    public void play() {
        System.out.println("Mac Music Player: ");
        player.play();
    }

    @Override
    public void pause() {
        System.out.println("Mac Music Player: ");
        player.pause();
    }

    @Override
    public void stop() {
        System.out.println("Mac Music Player: ");
        player.stop();
    }
}
