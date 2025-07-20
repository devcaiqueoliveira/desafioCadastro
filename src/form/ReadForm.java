package src.form;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadForm {
    public List<String> readQuestions(String path) {
        try {
            return Files.readAllLines(Paths.get("formulario.txt"));
        } catch (IOException e) {
            System.out.println("Erro ao ler o formulario: " + e.getMessage());
        }
        return List.of();
    }
}