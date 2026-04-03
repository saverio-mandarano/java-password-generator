package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String name = input.nextLine();
        System.out.println("Inserisci il tuo cognome:");
        String surname = input.nextLine();
        System.out.println("Inserisci il tuo colore preferito:");
        String color = input.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita:");
        int day = input.nextInt();
        System.out.println("Inserisci il tuo mese di nascita:");
        int month = input.nextInt();
        System.out.println("Inserisci il tuo anno di nascita:");
        int year = input.nextInt();

        int sum = day + month + year;
        
        // input.nextLine();
        // System.out.println("Inserisci stringa di prova:");
        // String string = input.nextLine();
        
        // System.out.println("Password generata: " + name + "-" + surname + "-" + color + "-" + sum + "-" + string);
        
        System.out.println("Password generata: " + name + "-" + surname + "-" + color + "-" + sum);
        
    }
}
