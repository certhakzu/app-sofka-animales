package org.sofka.animales.utilities;

import org.sofka.animales.utilities.abstracs.Animal;
import org.sofka.animales.utilities.interfaces.Comportamiento;


public class Dog extends Animal implements Comportamiento {

    public Dog() {
        this.tipoAnimal = "PERRO";
        this.raza = "";
        this.nombre = "";
        this.action = "";
    }

    @Override
    public String toString() {
        try {
            return (nombre.toUpperCase() + "\n" + tipoAnimal + "\n" + raza.toUpperCase() + "\nEstá: " + action);
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
