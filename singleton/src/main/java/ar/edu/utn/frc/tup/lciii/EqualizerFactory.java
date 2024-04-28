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
                return new EqualizerStrategyClassic(3, 7, 3);
            case ROCK:
                return new EqualizerStrategyRock(5, 5, 7);
            case ELECTRONIC:
                return new EqualizerStrategyElectronic(4, 7, 6);
            default:
                return new EqualizerStrategyPop(4, 4, 4);
        }
    }

    private static class EqualizerFactoryHolder {
        private static final EqualizerFactory INSTANCE = new EqualizerFactory();
    }
}
