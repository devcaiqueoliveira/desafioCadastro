package src.pet.service;

import src.pet.Pet;
import src.pet.enums.PetGender;
import src.pet.enums.PetType;
import src.pet.cache.PetCache;

public class PetService {
    public static void registerPet(Pet pet) {
        PetCache.addPet(pet);
    }

    public static String validateFullName(String petName, String petLastName) throws Exception {
        if (petName.trim().isEmpty() || petLastName.trim().isEmpty()) {
            throw new Exception("Nome e sobre nome são obrigatórios");
        }

        String fullName = petName + " " + petLastName;
        if (!fullName.matches("^[a-zA-Z\\s]+$")) {
            throw new Exception("O nome completo não pode conter números ou caracteres especiais.");
        }
        return fullName;
    }

    public static PetType validateType(String typeString) throws Exception {
        try {
            return PetType.valueOf(typeString.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new Exception("Escolha um tipo válido: GATO ou CACHORRO.");
        }
    }

    public static PetGender validateGender(String genderString) throws Exception {
        try {
            return PetGender.valueOf(genderString.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new Exception("Escolha um gênero válido: MACHO ou FEMEA.");
        }
    }

    public static double validateWeight(String weightString) throws Exception {
        if (weightString.trim().isEmpty()) {
            System.out.println("Peso não informado");
            return 0.0;
        }

        String formattedWeight = weightString.replace(',', '.');
        double weight = Double.parseDouble(formattedWeight);

        if (weight > 60.0 || weight < 0.5) {
            throw new Exception("O peso deve estar entre 0.5kg e 60kg");
        }
        return weight;
    }

    public static double validateAge(String ageString) throws Exception {
        if (ageString.trim().isEmpty()) {
            System.out.println("Idade não informada");
            return 0.0;
        }
        String formattedAge = ageString.replace(',', '.');
        double age = Double.parseDouble(formattedAge);

        if (age > 0 && age < 1) {
            System.out.println("idade detectada em meses, convertendo para anos.");
        }
        if (age > 20) {
            throw new Exception("A idade não pode ser maior que 20 anos.");
        }
        return age;
    }

}

