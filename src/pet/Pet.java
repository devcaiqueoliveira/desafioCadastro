package src.pet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import src.pet.address.PetAddress;
import src.pet.enums.PetGender;
import src.pet.enums.PetType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String petName;
    private String petLastName;
    private PetType petType;
    private PetGender petGender;
    private PetAddress petAddress;
    private double petAge;
    private double petWeight;
    private String petBreed;


    @Override
    public String toString() {
        return "Pet: " + petName + " " + petLastName +
                "\nTipo: " + ", Sexo: " + petGender + ", Raça: " + petBreed +
                "\nIdade: " + petAge + " anos, Peso: " + petWeight + " kg" +
                "\n" + petAddress;
    }
}