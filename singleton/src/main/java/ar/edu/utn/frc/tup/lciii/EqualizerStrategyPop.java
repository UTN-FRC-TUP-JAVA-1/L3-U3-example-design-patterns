package ar.edu.utn.frc.tup.lciii;

public class EqualizerStrategyPop extends AbstractEqualizerStrategy {

    public EqualizerStrategyPop(int bass, int mid, int treble) {
        super(bass, mid, treble);
    }

    @Override
    public void adjustFrequencies() {
        System.out.println("Adjusting Frequencies for Pop Style");
    }
}
