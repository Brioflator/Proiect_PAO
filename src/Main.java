
// CARTI.CARTE
//  EDITURA
//  TITLU
//  AUTOR
//  PRET

// ANGAJAT -- more like an admin
//  NUME

// CLIENT
//  ID
//  NUME
//  BUGET
//  CARD DE FIDELITATE

// COS
//  ID
//  DENUMIRE CARTI
//  NUMAR PRODUSE
//  SUMA TOTALA

// BANDA DESENATA
//  GENRE
//  PAGINI LUCIOASE

// PROVIDER
//  EDITURA ASOCIATA
//  CARTI DE ADUS
//  NUMAR CARTI

// CARD DE FIDELITATE
//  CATEGORIE
//  REDUCERE

//INTERFATA
//  ANGAJAT SIDE
//          PAROLA
//          ACCES LA CRUD PE CARTI
//  CLIENT SIDE
//          CREARE CONT
//          PAROLA


//MAIN

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome !");
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. Quit");

            switch (scanner.nextInt()) {
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    scanner.close();
                    System.exit(0);
                    break;
                default :
                    System.out.println("Optiune invalida!");
            }
            
            scanner.nextLine();
        }
    }
}