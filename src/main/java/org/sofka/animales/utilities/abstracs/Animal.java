package org.sofka.animales.utilities.abstracs;

import org.sofka.animales.utilities.interfaces.Comportamiento;

public abstract class Animal {

    protected String tipoAnimal;
    protected String raza;
    protected String nombre;
    protected String action;

    public String getAction() { return action; }

    public void setAction(String action) {

        switch (action){
            case "1":
                this.action = Comportamiento.CAMINAR;
                break;
            case "2":
                this.action = Comportamiento.CORRER;
                break;
            case "3":
                this.action = Comportamiento.COMER;
                break;
            case "4":
                this.action = Comportamiento.JUGAR;
                break;
            default:
                this.action = "DESCONOCIDO";
        }
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}