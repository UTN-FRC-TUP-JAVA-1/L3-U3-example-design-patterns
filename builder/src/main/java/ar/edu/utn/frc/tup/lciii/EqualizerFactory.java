package ar.edu.utn.frc.tup.lciii;

public class EqualizerFactory {

    private EqualizerFactory() {
    }

    public static EqualizerFactory getInstance() {
        return EqualizerFactoryHolder.INSTANCE;
    }

    public EqualizerStrategy createEqualizer(EqualizerMode equalizerMode) {
        switch (equalizerMode) {
            case CLASSIC:
                return new EqualizerStrategyClassic.Builder().withBass(5).withMid(5).withTreble(5).build() ;
            case ROCK:
                return new EqualizerStrategyRock.Builder().withBass(6).withMid(6).withTreble(6).build();
            case ELECTRONIC:
                return new EqualizerStrategyElectronic.Builder().withBass(7).withMid(7).withTreble(7).build();
            default:
                return new EqualizerStrategyPop.Builder().withBass(4).withMid(4).withTreble(4).build();
        }
    }

    private static class EqualizerFactoryHolder {
        private static final EqualizerFactory INSTANCE = new EqualizerFactory();
    }
}
