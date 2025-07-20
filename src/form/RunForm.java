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
        try {
            List<String> questions = readForm.readQuestions("formulario.txt");
            List<String> answers = new ArrayList<>();

            System.out.println("--- Inicio do formulario ---");
            for (String question : questions) {
                String answer = readAnswers.readAnswers(question);
                answers.add(answer);
            }
            responseLog.saveAnswers(answers, "respostas.txt");
            System.out.println("Resposta salva com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}