package ar.edu.utn.frc.tup.lciii;


public abstract class AbstractEqualizerStrategy implements EqualizerStrategy {

    private final int bass;
    private final int mid;
    private final int treble;

    public void showEqualization() {
        System.out.println("Bass: " + bass + " Mid: " + mid + " Treble: " + treble);
    }

    protected AbstractEqualizerStrategy(int bass, int mid, int treble) {
        this.bass = bass;
        this.mid = mid;
        this.treble = treble;
    }
}
