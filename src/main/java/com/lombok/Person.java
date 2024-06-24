package com.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter // por defecto son públicos
@Getter// (value = AccessLevel.PROTECTED) // se les puede asignar un nivel de acceso
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

}
