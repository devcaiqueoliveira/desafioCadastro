package src;

import java.util.Scanner;

public class SwitchMenu {
    public static void switchOption() {
        Scanner sc = new Scanner(System.in);
        MessageTemplate.helloMenuMessage();
        MessageTemplate.mainMenuMessage();

        while (true) {
            String input = sc.nextLine();
            int option = 0;
            MessageTemplate.mainMenuMessage();

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Somente numeros sao aceitos");
            }

            switch (option) {
                case 1 -> {
                    System.out.println("TESTE");
//                    PetService.registerPet(new Pet(petName, petLastName, petType, petGender, petAge, petWeight, petBreed));
                }
                case 2 -> {
                    System.out.println("TEST2");
                }
                case 3 -> {
                    System.out.println("TESTE3");
                }
                case 4 -> {
                    System.out.println("TESTE4");
                }
                case 5 -> {
                    System.out.println("TESTE5");
                }
                case 6 -> {
                    System.out.println("Fechando o programa...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção invalida, tente novamente.");
            }
        }
    }

}
