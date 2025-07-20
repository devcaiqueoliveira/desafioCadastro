package src.cache;

import src.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetCache {
    private static final Map<String, Pet> PET_HASH_MAP = new HashMap<>();

    public static void addPet(Pet pet) {
        PET_HASH_MAP.put(pet.getPetName(), pet);
    }
    public static void removePet(Pet pet) {
        PET_HASH_MAP.remove(pet.getPetName());
    }
}