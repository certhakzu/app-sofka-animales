package org.sofka.animales.utilities;

import org.sofka.animales.utilities.abstracs.Animal;
import org.sofka.animales.utilities.interfaces.Comportamiento;

public class Dog extends Animal implements Comportamiento {

    public Dog() {
    }

    public Dog(String raza, String nombre){
        this.tipoAnimal = "PERRO";
        this.raza = raza;
        this.nombre = nombre;
        this.action = "";
    }


    @Override
    public String toString() {
        try {
            return "\n" + nombre.toUpperCase() + "\n" + raza.toUpperCase() + "\n" + tipoAnimal.toUpperCase() + "\nEstá: " + action.toString().toUpperCase();
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
