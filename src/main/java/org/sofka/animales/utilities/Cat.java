package org.sofka.animales.utilities;

import org.sofka.animales.utilities.abstracs.Animal;
import org.sofka.animales.utilities.interfaces.Comportamiento;

public class Cat extends Animal implements Comportamiento {

    public Cat(){
    }
    public Cat(String nombre, String raza) {
        this.tipoAnimal = "GATO";
        this.raza = raza;
        this.nombre = nombre;
        this.action = null;
    }


    @Override
    public String toString() {
        return nombre.toUpperCase() + "\n" + raza.toUpperCase() + "\n" + tipoAnimal.toUpperCase() + "\nEstá: " + action;
    }
}
