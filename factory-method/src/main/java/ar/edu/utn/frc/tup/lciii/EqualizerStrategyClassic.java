package ar.edu.utn.frc.tup.lciii;

public class EqualizerStrategyClassic extends AbstractEqualizerStrategy {

    public EqualizerStrategyClassic(int bass, int mid, int treble) {
        super(bass, mid, treble);
    }

    @Override
    public void adjustFrequencies() {
        System.out.println("Adjusting Frequencies for Classic Style");
    }
}
