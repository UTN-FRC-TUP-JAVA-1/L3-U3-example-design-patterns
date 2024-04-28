package ar.edu.utn.frc.tup.lciii;

import lombok.Data;

@Data
public class MusicPlayer {

    private EqualizerStrategy equalizerStrategy;

    public MusicPlayer(EqualizerStrategy equalizerStrategy) {
        this.equalizerStrategy = equalizerStrategy;
    }

    public void changeEqualization(EqualizerStrategy equalizerStrategy) {
        this.equalizerStrategy = equalizerStrategy;
    }

    public void adjustFrequency() {
        System.out.println("Applying frequency adjustment...");
        equalizerStrategy.adjustFrequencies();
        equalizerStrategy.showEqualization();
    }
}
