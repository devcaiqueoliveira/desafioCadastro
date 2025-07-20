package src.form;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ResponseLog {
    public void saveAnswers(List<String> answers, String path) throws IOException {
        List<String> formattedAnswers = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            formattedAnswers.add((i + 1) + ". " + answers.get(i));
        }
        Files.write(Paths.get("respostas.txt"), formattedAnswers);
    }
}