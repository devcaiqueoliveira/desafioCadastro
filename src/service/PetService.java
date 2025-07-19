package src.service;

import src.MessageTemplate;
import src.Pet;
import src.PetCache;

public class PetService {
    public static void registerPet(Pet pet) {
        PetCache.addPet(pet);
        MessageTemplate.registerPetMessage(pet);
    }
    public static void sendPetGuest() {
        
    }

}
