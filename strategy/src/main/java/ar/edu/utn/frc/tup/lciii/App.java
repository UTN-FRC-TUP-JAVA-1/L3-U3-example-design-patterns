package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Strategy Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        EqualizerStrategy equalizerStrategy = new EqualizerStrategyPop();
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
                    musicPlayer.changeEqualization(new EqualizerStrategyPop());
                    break;
                case 2:
                    musicPlayer.changeEqualization(new EqualizerStrategyClassic());
                    break;
                case 3:
                    musicPlayer.changeEqualization(new EqualizerStrategyRock());
                    break;
                case 4:
                    musicPlayer.changeEqualization(new EqualizerStrategyElectronic());
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }

            musicPlayer.adjustFrequency();

        } while (opcion != 0);

        scanner.close();
    }
}
