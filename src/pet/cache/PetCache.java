package src.pet.cache;

import src.pet.Pet;
import src.pet.repository.PetRepository;

import java.util.ArrayList;
import java.util.List;

public class PetCache implements PetRepository {
    private static final List<Pet> PET_LIST = new ArrayList<>();

    @Override
    public void save(Pet pet) {
        PET_LIST.add(pet);
        System.out.println("Pet salvo no Cache com sucesso!");
    }

    public static List<Pet> getPetList() {
        return new ArrayList<>(PET_LIST);
    }
}