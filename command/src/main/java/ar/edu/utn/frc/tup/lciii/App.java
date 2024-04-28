package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        MusicPlayer musicPlayer = new MusicPlayer();

        MusicCommand playCommand = new PlayMusicCommand(musicPlayer);
        MusicCommand pauseCommand = new PauseMusicCommand(musicPlayer);
        MusicCommand stopCommand = new StopMusicCommand(musicPlayer);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("Select an equalization strategy:");
        System.out.println("1. Play");
        System.out.println("2. Pause");
        System.out.println("3. Stop");
        System.out.println("0. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("Enter your option: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    remoteControl.setCommand(playCommand);
                    break;
                case 2:
                    remoteControl.setCommand(pauseCommand);
                    break;
                case 3:
                    remoteControl.setCommand(stopCommand);
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
            remoteControl.pressButton();
        } while (opcion != 0);

        scanner.close();
    }
}
