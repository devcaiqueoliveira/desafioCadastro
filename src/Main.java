package src;

import src.form.ReadAnswers;
import src.form.ReadForm;
import src.form.ResponseLog;
import src.form.RunForm;
import src.pet.repository.PetRepository;
import src.pet.cache.PetCache;
import src.pet.service.PetService;
import src.pet.validator.PetValidator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadForm readForm = new ReadForm();
        ReadAnswers readAnswers = new ReadAnswers();
        ResponseLog responseLog = new ResponseLog();

        PetValidator petValidator = new PetValidator();
        PetRepository petRepository = new PetCache();
        PetService petService = new PetService(petRepository);

        RunForm runForm = new RunForm(
                readForm,
                readAnswers,
                responseLog,
                petValidator,
                petService
        );

        runForm.executeForm();
    }
}