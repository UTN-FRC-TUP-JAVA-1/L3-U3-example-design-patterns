package ar.edu.utn.frc.tup.lciii;

public interface SoundEffectHandler {

    void applyEffect(Song song);

    void setNextHandler(SoundEffectHandler nextHandler);
}
