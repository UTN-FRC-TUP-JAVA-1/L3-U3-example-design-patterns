package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        EqualizerFactory equalizerFactory = EqualizerFactory.getInstance(); // Tomo la factoria desde un singleton
        EqualizerMode equalizerMode = EqualizerMode.POP;
        EqualizerStrategy equalizerStrategy = equalizerFactory.createEqualizer(equalizerMode);

        MusicPlayer musicPlayer = new MusicPlayer(equalizerStrategy);

        System.out.println("Select an equalization strategy:");
        System.out.println("1. Pop");
        System.out.println("2. Classic");
        System.out.println("3. Rock");
        System.out.println("4. Electronic");
        System.out.println("0. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("Enter your option: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    equalizerMode = EqualizerMode.POP;
                    break;
                case 2:
                    equalizerMode = EqualizerMode.CLASSIC;
                    break;
                case 3:
                    equalizerMode = EqualizerMode.ROCK;
                    break;
                case 4:
                    equalizerMode = EqualizerMode.ELECTRONIC;
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
            musicPlayer.changeEqualization(equalizerFactory.createEqualizer(equalizerMode));
            musicPlayer.adjustFrequency();
        } while (opcion != 0);
        scanner.close();
    }
}
