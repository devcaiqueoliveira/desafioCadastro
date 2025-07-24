package src.pet.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetAddress {
    private String street;
    private String number;
    private String city;

    @Override
    public String toString() {
        return "Endereço: " + street + ", " + number + " - " + city;
    }
}