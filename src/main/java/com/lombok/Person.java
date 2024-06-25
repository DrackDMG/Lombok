package com.lombok;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Value // inmutable y nos define los métodos getter y los atributos como privados y final
@RequiredArgsConstructor // genera un constructor con los atributos marcados con @NonNull y los atributos finales
public class Person {

    //@Setter // se pueden asignar a nivel de atributo
     Long id;
     //public String name; // si se quiere que sea publico se le puede agregar el modificador de acceso
 @NonNull
     String name;
     String email;
     String phone;
     String address;
     String city;
     String state;
     String country;
     String zipCode;
     LocalDate birthDate;

}
