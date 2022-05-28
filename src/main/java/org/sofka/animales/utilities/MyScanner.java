package org.sofka.animales.utilities;

import java.util.Scanner;

public class MyScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static MyScanner getInstance(){
        return new MyScanner();
    }

    public String getAsnwer(){
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
