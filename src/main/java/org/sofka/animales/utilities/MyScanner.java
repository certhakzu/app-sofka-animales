package org.sofka.animales.utilities;

import java.util.Scanner;

public class MyScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static MyScanner getInstance(){
        return new MyScanner();
    }

    public String getAsnwer(){
        try {
            return scanner.nextLine();
        }catch (Exception exception){
            throw new MyException(exception.getMessage(), exception);
        }
    }

    public void close() {
        scanner.close();
    }
}