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
        this.action = "";
    }


    @Override
    public String toString() {
        try {
            return "\n" + nombre.toUpperCase() + "\n" + raza.toUpperCase() + "\n" + tipoAnimal.toUpperCase() + "\nEstá: " + action.toString().toUpperCase();
        }catch (NullPointerException exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
