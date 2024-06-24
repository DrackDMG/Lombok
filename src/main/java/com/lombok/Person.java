package com.lombok;

import lombok.*;

import java.time.LocalDate;

@Setter // por defecto son públicos
@Getter// (value = AccessLevel.PROTECTED) // se les puede asignar un nivel de acceso
@AllArgsConstructor // crea un constructor con argumentos //(staticName = "of") //para crear un método estático que devuelva una instancia de la clase con los atributos requeridos
@NoArgsConstructor // crea un constructor vacío //(access = AccessLevel.PUBLIC) // se les puede asignar un nivel de acceso
public class Person {

    //@Setter // se pueden asignar a nivel de atributo
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private LocalDate birthDate;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
