package ar.edu.utn.frc.tup.lciii;

public class EqualizerDecorator extends SongDecorator {

    private String equalizerSetting;

    public EqualizerDecorator(Playable song, String equalizerSetting) {
        super(song);
        this.equalizerSetting = equalizerSetting;
    }

    @Override
    public void play() {
        System.out.println("Applying equalizer setting: " + equalizerSetting);
        super.play();
    }
}
