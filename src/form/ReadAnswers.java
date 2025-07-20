package src.form;

import java.util.Scanner;

public class ReadAnswers {
    private final Scanner scanner = new Scanner(System.in);
    public String readAnswers(String answer) {
        System.out.println(answer);
        System.out.println("Sua resposta: ");
        return scanner.nextLine();
    }
}