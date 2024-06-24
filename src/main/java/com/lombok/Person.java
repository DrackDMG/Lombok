package com.lombok;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Setter // por defecto son públicos
@Getter// (value = AccessLevel.PROTECTED) // se les puede asignar un nivel de acceso
@AllArgsConstructor // crea un constructor con argumentos //(staticName = "of") //para crear un método estático que devuelva una instancia de la clase con los atributos requeridos
@NoArgsConstructor // crea un constructor vacío //(access = AccessLevel.PUBLIC) // se les puede asignar un nivel de acceso
@FieldDefaults(level = AccessLevel.PRIVATE /*makeFinal = true // hace que sean Final*/) // se les puede asignar un nivel de acceso a los atributos
//@ToString(exclude = {"address", "city", "state", "country", "zipCode"})//se crea el toString // se puden excluir atributos
//@ToString(includeFieldNames = false) // muestra solo los valores de los atributos
@ToString(of = {"id", "name", "email", "phone", "birthDate"}) // muestra solo los valores de los atributos
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
