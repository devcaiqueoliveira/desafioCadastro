package src.form;

import java.util.Scanner;

public class ReadAnswers {
    private final Scanner scanner = new Scanner(System.in);
    public String readAnswers(String answers) {
        System.out.println(answers);
        System.out.println("Sua resposta: ");
        return scanner.nextLine();
    }
}