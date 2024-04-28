package ar.edu.utn.frc.tup.lciii;

public class VolumeHandler extends BaseSoundEffectHandler {

    @Override
    public void applyEffect(Song song) {
        System.out.println("Applying volume effect to the song: " + song.getTitle());
        applyNextEffect(song); // Pasar al siguiente efecto
    }
}
