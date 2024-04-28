package ar.edu.utn.frc.tup.lciii;

public class MusicPlayerFacade {

    private MusicPlayer musicPlayer;
    private PlaylistManager playlistManager;
    private Equalizer equalizer;
    private VolumeControl volumeControl;

    public MusicPlayerFacade() {
        this.musicPlayer = new MusicPlayer();
        this.playlistManager = new PlaylistManager();
        this.equalizer = new Equalizer();
        this.volumeControl = new VolumeControl();
    }

    public void playSong(String song) {
        musicPlayer.playSong(song);
    }

    public void stopSong() {
        musicPlayer.stopSong();
    }

    public void createPlaylist(String name) {
        playlistManager.createPlaylist(name);
    }

    public void addSongToPlaylist(String playlist, String song) {
        playlistManager.addSongToPlaylist(playlist, song);
    }

    public void applyEqualizerSetting(String setting) {
        equalizer.applyEqualizerSetting(setting);
    }

    public void adjustVolume(int volumeLevel) {
        volumeControl.adjustVolume(volumeLevel);
    }
}
