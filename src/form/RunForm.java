package src.form;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class RunForm {
    private final ReadForm readForm;
    private final ReadAnswers readAnswers;
    private final ResponseLog responseLog;

    public RunForm(ReadForm readForm, ReadAnswers readAnswers, ResponseLog responseLog) {
        this.readForm = readForm;
        this.readAnswers = readAnswers;
        this.responseLog = responseLog;
    }

    public void executeForm() {
            List<String> questions = readForm.readQuestions("formulario.txt");
            List<String> answers = new ArrayList<>();

            System.out.println("--- Inicio do formulario ---");
            for (String question : questions) {
                String answer = readAnswers.readAnswers(question);
                answers.add(answer);
            }
            responseLog.saveAnswers(answers);
            System.out.println("Respostas salvas com sucesso!");
    }
}