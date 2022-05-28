package org.sofka.animales.test;

import org.sofka.animales.utilities.Cat;
import org.sofka.animales.utilities.Dog;
import org.sofka.animales.utilities.MessagesAnimal;
import org.sofka.animales.utilities.MyScanner;

import java.io.IOException;

public class App {

    static MessagesAnimal messages = MessagesAnimal.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        init();
    }

    private static void init(){

        Boolean flag;
        do {
            messages.showWelcome();
            messages.showSectionAnimal();
            flag = selectOption(scanner.getAsnwer());

        }while (Boolean.TRUE.equals(flag));
    }

    private static Boolean selectOption(String option) {
        switch (option){
            case "1":
                Dog dog = new Dog();
                messages.showPetitionNombre();
                dog.setNombre(scanner.getAsnwer());
                messages.showPetitionRaza();
                dog.setRaza(scanner.getAsnwer());
                messages.showPetitionAction();
                dog.setAction(scanner.getAsnwer());
                messages.showAnimal(dog);
                break;
            case "2":
                Cat cat = new Cat();
                messages.showPetitionNombre();
                cat.setNombre(scanner.getAsnwer());
                messages.showPetitionRaza();
                cat.setRaza(scanner.getAsnwer());
                messages.showPetitionAction();
                cat.setAction(scanner.getAsnwer());
                messages.showAnimal(cat);
                break;
            case "3":
                scanner.close();
                return false;
            default:
                messages.showIncoretOption();
                messages.pressAnyKeyToContinue();
        }
        return true;
    }
}
