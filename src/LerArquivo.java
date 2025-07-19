package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public final class LerArquivo {
    public static void lerArquivo() throws IOException {
        File file = new File("formulario.txt");
        String dados = new String(Files.readAllBytes(file.toPath()));
    }
}