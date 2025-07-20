package src.pet.address;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PetAddress {
    private String street;
    private String number;
    private String city;

    @Override
    public String toString() {
        return "Endereço: " + street + ", " + number + " - " + city;
    }
}