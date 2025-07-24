package src.form;

import lombok.AllArgsConstructor;
import src.pet.Pet;
import src.pet.address.PetAddress;
import src.pet.enums.PetGender;
import src.pet.enums.PetType;
import src.pet.service.PetService;
import src.pet.validator.PetValidator;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
public final class RunForm {
    private final ReadForm readForm;
    private final ReadAnswers readAnswers;
    private final ResponseLog responseLog;
    private final PetValidator petValidator;
    private final PetService petService;

    public void executeForm() {
        try {
            List<String> questions = readForm.readQuestions("formulario.txt");
            List<String> answers = new ArrayList<>();

            System.out.println("--- Inicio do formulario ---");
            for (String question : questions) {
                String answer = readAnswers.readAnswers(question);
                answers.add(answer);
            }
            responseLog.saveAnswers(answers);

            var it = answers.iterator();

            String fullName = it.next();
            int firstClear = fullName.trim().indexOf(' ');
            String petName = (firstClear == -1) ? fullName : fullName.substring(0, firstClear);
            String petLastName = (firstClear == -1) ? "" : fullName.substring(firstClear + 1);
            String fullPetName = petValidator.validateFullName(petName, petLastName);

            PetType petType = petValidator.validateType(it.next());

            PetGender petGender = petValidator.validateGender(it.next());


            String fullAddress = it.next();
            String[] addressParts = fullAddress.split(",");
            String street = addressParts.length > 0 ? addressParts[0].trim() : "";
            String addressNumber = addressParts.length > 1 ? petValidator.validateAddressNumber(addressParts[1].trim()) : "";
            String city = addressNumber.length() > 2 ? addressParts[2].trim() : "";

            double petAge = petValidator.validateAge(it.next());
            double petWeight = petValidator.validateWeight(it.next());
            String petBreed = petValidator.validatePetBreed(it.next());

            PetAddress petAddress = new PetAddress(street, addressNumber, city);

            Pet pet = new Pet();
            pet.setPetName(petName.trim());
            pet.setPetLastName(petLastName.trim());
            pet.setPetBreed(petBreed);
            pet.setPetType(petType);
            pet.setPetGender(petGender);
            pet.setPetAge(petAge);
            pet.setPetWeight(petWeight);
            pet.setPetAddress(petAddress);
            petService.registerPet(pet);

            System.out.println("Pet cadastrado com sucesso!");
        } catch (NoSuchElementException e) {
            System.out.println("ERRO NO CADASTRO: O formulário não foi completamente preenchido.");
        } catch (Exception e) {
            System.out.println("ERRO NO CADASTRO: " + e.getMessage());
        }
    }
}