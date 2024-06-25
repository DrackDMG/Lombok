package com.lombok;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data // genera los métodos getter, setter, equals, hashcode, toString
@AllArgsConstructor // genera un constructor con todos los atributos
@NoArgsConstructor // genera un constructor vacío
@FieldDefaults(level = AccessLevel.PRIVATE) // se puede asignar a nivel de clase porque el @Data no lo asigna
public class Person {

    //@Setter // se pueden asignar a nivel de atributo
     Long id;
     //public String name; // si se quiere que sea publico se le puede agregar el modificador de acceso
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
