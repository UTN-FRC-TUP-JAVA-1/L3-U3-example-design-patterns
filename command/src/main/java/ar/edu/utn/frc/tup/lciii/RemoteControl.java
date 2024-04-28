package ar.edu.utn.frc.tup.lciii;

public class RemoteControl {

    private MusicCommand command;

    public void setCommand(MusicCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
