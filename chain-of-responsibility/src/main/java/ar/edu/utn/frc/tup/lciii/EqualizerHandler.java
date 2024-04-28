package ar.edu.utn.frc.tup.lciii;

public class EqualizerHandler extends BaseSoundEffectHandler {

    @Override
    public void applyEffect(Song song) {
        System.out.println("Applying equalizer effect to the song: " + song.getTitle());
        applyNextEffect(song); // Pasar al siguiente efecto
    }
}
