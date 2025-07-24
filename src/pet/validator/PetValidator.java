package src.pet.validator;

import src.pet.Pet;
import src.pet.enums.PetGender;
import src.pet.enums.PetType;
import static src.util.Constants.NOT_INFORMED;

public class PetValidator {

    public String validateFullName(String petName, String petLastName) throws Exception {
        if (petName.trim().isEmpty() || petLastName.trim().isEmpty()) {
            throw new Exception("Nome e sobrenome são obrigatórios");
        }

        String fullName = petName + " " + petLastName;
        if (!fullName.matches("^[a-zA-Z\\s]+$")) {
            throw new Exception("O nome completo não pode conter números ou caracteres especiais.");
        }
        return fullName;
    }

    public String validatePetBreed(String petBreed) throws Exception {
        if (petBreed == null || petBreed.trim().isEmpty()) {
            return NOT_INFORMED;
        }
        String trimmedPetBreed = petBreed.trim();
        if (!trimmedPetBreed.matches("^[a-zA-Z\\s]+$")) {
            throw new Exception("A raça não pode conter números ou caracteres especiais.");
        }
        return trimmedPetBreed;
    }

    public PetType validateType(String typeString) throws Exception {
        try {
            return PetType.valueOf(typeString.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new Exception("Escolha um tipo válido: GATO ou CACHORRO.");
        }
    }

    public PetGender validateGender(String genderString) throws Exception {
        try {
            return PetGender.valueOf(genderString.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new Exception("Escolha um gênero válido: MACHO ou FEMEA.");
        }
    }

    public double validateWeight(String weightString) throws Exception {
        if (weightString == null || weightString.trim().isEmpty()) {
            System.out.println("Peso não informado");
            return 0.0;
        }

        String formattedWeight = weightString.replace(',', '.');
        double weight = Double.parseDouble(formattedWeight);

        if (weight < 0.5 || weight > 60) {
            throw new Exception("O peso deve estar entre 0.5kg e 60kg");
        }
        return weight;
    }

    public double validateAge(String ageString) throws Exception {
        if (ageString == null || ageString.trim().isEmpty()) {
            System.out.println("Idade não informada");
            return 0.0;
        }
        String formattedAge = ageString.replace(',', '.');
        double age = Double.parseDouble(formattedAge);

        if (age > 0 && age < 1) {
            System.out.println("Idade detectada em meses, convertendo para anos.");
            return age;
        }
        if (age > 20) {
            throw new Exception("A idade não pode ser maior que 20 anos.");
        }
        return age;
    }

    public String validateAddressNumber(String number) {
        if (number == null || number.trim().isEmpty()) {
            return NOT_INFORMED;
        }
        return number.trim();
    }
}
