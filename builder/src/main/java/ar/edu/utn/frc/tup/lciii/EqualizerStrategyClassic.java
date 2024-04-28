package ar.edu.utn.frc.tup.lciii;

public class EqualizerStrategyClassic extends AbstractEqualizerStrategy{

    private EqualizerStrategyClassic(Builder builder) {
        super(builder.bass, builder.mid, builder.treble);
    }

    @Override
    public void adjustFrequencies() {
        System.out.println("Adjusting Frequencies for Classic Style");
    }

    public static class Builder {
        private int bass;
        private int mid;
        private int treble;

        public Builder withBass(int bass) {
            this.bass = bass;
            return this;
        }

        public Builder withMid(int mid) {
            this.mid = mid;
            return this;
        }

        public Builder withTreble(int treble) {
            this.treble = treble;
            return this;
        }

        public EqualizerStrategyClassic build() {
            return new EqualizerStrategyClassic(this);
        }
    }
}
