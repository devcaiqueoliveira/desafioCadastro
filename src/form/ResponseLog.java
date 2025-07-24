package src.form;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ResponseLog {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");

    public void saveAnswers(List<String> answers) {
        if (answers == null || answers.isEmpty()) {
            System.out.println("Nenhuma resposta para salvar.");
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        String timestamp = now.format(FORMATTER);

        String petName = answers.getFirst();
        if (petName == null) return;
        petName = petName.replaceAll("\\s+", "").toUpperCase();
        String fileName = timestamp + "-" + petName + ".TXT";

        try {
            Path directory = Paths.get("petsCadastrados");
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }
            Path filePath = directory.resolve(fileName);

            List<String> formattedAnswers = new ArrayList<>();
            for (int i = 0; i < answers.size(); i++) {
                String answer = answers.get(i);
                formattedAnswers.add((i + 1) + " - " + answer);
            }

            Files.write(filePath, formattedAnswers);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo de respostas: " + e.getMessage());
        }
    }
}