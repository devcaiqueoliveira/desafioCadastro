package src.form;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadForm {
    public List<String> readQuestions(String caminho) throws IOException {
        return Files.readAllLines(Paths.get("formulario.txt"));
    }
}
