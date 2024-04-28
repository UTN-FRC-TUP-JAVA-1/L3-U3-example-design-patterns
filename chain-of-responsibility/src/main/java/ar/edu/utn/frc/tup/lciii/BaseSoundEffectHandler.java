package ar.edu.utn.frc.tup.lciii;

public abstract class BaseSoundEffectHandler implements SoundEffectHandler {

    protected SoundEffectHandler nextHandler;

    public void setNextHandler(SoundEffectHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void applyNextEffect(Song song) {
        if (nextHandler != null) {
            nextHandler.applyEffect(song);
        }
    }
}
