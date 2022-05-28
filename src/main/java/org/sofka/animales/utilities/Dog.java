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
        this.action = null;
    }


    @Override
    public String toString() {
        return nombre.toUpperCase() + "\n" + raza.toUpperCase() + "\n" + tipoAnimal.toUpperCase() + "\nEstá: " + action;
    }
}
