package src.pet.service;

import lombok.AllArgsConstructor;
import src.pet.Pet;
import src.pet.repository.PetRepository;

@AllArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public void registerPet(Pet pet) {
        this.petRepository.save(pet);
    }



}

