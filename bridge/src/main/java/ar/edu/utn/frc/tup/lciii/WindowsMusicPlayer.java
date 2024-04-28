package ar.edu.utn.frc.tup.lciii;

public class WindowsMusicPlayer extends MusicPlayer {

    public WindowsMusicPlayer(Player player) {
        super(player);
    }

    @Override
    public void play() {
        System.out.println("Windows Music Player: ");
        player.play();
    }

    @Override
    public void pause() {
        System.out.println("Windows Music Player: ");
        player.pause();
    }

    @Override
    public void stop() {
        System.out.println("Windows Music Player: ");
        player.stop();
    }
}
