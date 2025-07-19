package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class LerArquivo {
    //    public static void lerArquivo() throws IOException {
//        File file = new File("formulario.txt");
//        String dados = new String(Files.readAllBytes(file.toPath()));
//    }
    public static void lerFormularioEObterRespostas() throws FileNotFoundException {
        File arquivoFormulario = new File("formulario.txt");
        Scanner leitorArquivo = new Scanner(arquivoFormulario);
        Scanner leitorUsuario = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("--- Inicio do Formulario ---");

        while (leitorArquivo.hasNextLine()) {
            int i = 0;
            int i2 = i + 1;
            String pergunta = leitorArquivo.nextLine();
            System.out.println(pergunta);
            System.out.println("Sua resposta: ");
            String resposta = leitorUsuario.nextLine();
            respostas.add(resposta);
        }

        System.out.println("--- Fim do formulario ---");
        System.out.println("\nRespostas coletadas:");

        String arquivoRespostas = "respostas.txt";

        List<String> linhasParaSalvar = new ArrayList<>();
        for (int i = 0; i < respostas.size(); i++) {
            String linhaFormatada = (i + 1 + ". " + respostas.get(i));
            linhasParaSalvar.add(linhaFormatada);
        }

        try {
            Files.write(Paths.get(arquivoRespostas), linhasParaSalvar);
            System.out.println("\nRespostas salvas com sucesso ao arquivo '" + arquivoRespostas + "'!");
        } catch (IOException e) {
            System.err.println("\nOcorreu um erro ao salvar as respostas.");
        } finally {
            leitorArquivo.close();
            leitorUsuario.close();
        }
    }
}