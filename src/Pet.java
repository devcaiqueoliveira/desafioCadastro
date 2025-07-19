package src;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pet {
    private String petName;
    private String petLastName;
    private PetType petType;
    private PetGender petGender;
    private int petAge;
    private float petWeight;
    private String petBreed;
}
