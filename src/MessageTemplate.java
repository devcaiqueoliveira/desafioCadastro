package src;

public interface MessageTemplate {
    public static void helloMenuMessage() {
        System.out.println("-------------------------------");
        System.out.println("---------- Bem-Vindo ---------");
    }
    public static void mainMenuMessage() {
        System.out.println("-------------------------------");
        System.out.println("-- Escolha oque deseja fazer --");
        System.out.println("-------------------------------");
        System.out.println("1. Cadastrar um novo pet");
        System.out.println("2. Alterar os dados do pet cadastrado");
        System.out.println("3. Deletar um pet cadastrado");
        System.out.println("4. Listar todos os pets cadastrados");
        System.out.println("5. Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6. Sair");
    }
    public static void registerPetMessage(Pet pet) {
        System.out.println("Pet '" + pet.getPetName() + "' cadastrado com sucesso!");
    }
    public static final String NOT_INFORMED = "NÃO INFORMADO";
}