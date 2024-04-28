package ar.edu.utn.frc.tup.lciii;

public class EqualizerStrategyElectronic extends AbstractEqualizerStrategy {

    public EqualizerStrategyElectronic(int bass, int mid, int treble) {
        super(bass, mid, treble);
    }

    @Override
    public void adjustFrequencies() {
        System.out.println("Adjusting Frequencies for Electronic Style");
    }
}
