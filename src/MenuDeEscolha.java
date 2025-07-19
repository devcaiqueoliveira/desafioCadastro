package src;

import java.util.Scanner;

public class MenuDeEscolha {
    public static void switchOption(Scanner scanner) {
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
                System.out.println("Fechando o programa...");
                scanner.close();
            }

            default -> System.out.println("Opção invalida, tente novamente.");
        }
    }
}
