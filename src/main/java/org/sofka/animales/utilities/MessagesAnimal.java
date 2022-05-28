package org.sofka.animales.utilities;

import org.sofka.animales.utilities.abstracs.Animal;

import java.io.IOException;
import java.util.logging.Logger;

public class MessagesAnimal {

    public static final Logger logger = Logger.getLogger(String.valueOf(MessagesAnimal.class));

    public static MessagesAnimal getInstance(){
        return new MessagesAnimal();
    }

    public void showWelcome(){
        logger.info("Este es un Simulador de Animales");
    }

    public void showSectionAnimal(){
        logger.info("Que Animal Quiere?\n\n1. Perro\n2. Gato\n3. Salir\n\n::> ");
    }

    public void showAnimal(Animal animal){
        logger.info(animal.toString());
    }

    public void showPetitionTypeAnimal(){
        logger.info("Tipo de Animal: ");
    }

    public void showPetitionRaza(){
        logger.info("Raza: ");
    }

    public void showPetitionNombre(){
        logger.info("Nombre: ");
    }

    public void showPetitionAction(){
        logger.info("Qué está haciendo?\n\n1. Caminar\n2. Correr\n3. Comer\n4. Jugar");
    }

    public void showIncoretOption(){
        logger.warning("Opción Incorrecta!");
    }

    public void pressAnyKeyToContinue(){
        logger.info("Presiona Cualquier tecla para Continuar...");
        try {
            System.in.read();
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }

    }
}
