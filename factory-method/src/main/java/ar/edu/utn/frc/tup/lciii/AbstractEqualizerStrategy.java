package ar.edu.utn.frc.tup.lciii;

public abstract class AbstractEqualizerStrategy implements EqualizerStrategy {

    private int bass;
    private int mid;
    private int treble;

    public AbstractEqualizerStrategy(int bass, int mid, int treble) {
        this.bass = bass;
        this.mid = mid;
        this.treble = treble;
    }

    public void showEqualization() {
        System.out.println("Bass: " + bass + " Mid: " + mid + " Treble: " + treble);
    }
}
