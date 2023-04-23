
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


import CARTI.BANDA_DESENATA;
import CARTI.CARTE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CARTE carte = new CARTE(10, "Harry Potter", "J.K. Rowling","HUMANITAS", 20);
        BANDA_DESENATA banda = new BANDA_DESENATA(20, "HUMANITAS", "Batman", "Bob Kane", 30, "Action", true);


        Integer cantitate;
        String editura, titlu, autor;
        int pret;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome !");
        while (true) {
            System.out.print("\033[H\033[2J"); // clear screen on linux
            System.out.flush();
            System.out.println("--Admin Menu--");
            System.out.println("1. Adauga carte");
            System.out.println("2. Print carti");
            System.out.println("3. Sterge toate cartile");
            System.out.println("4. Quit");

            switch (scanner.nextInt()) {
                case 1 :
                    System.out.println("Cantitate");
                    cantitate = scanner.nextInt();
                    System.out.println("Editura");
                    editura = scanner.next();
                    System.out.println("Titlu");
                    titlu = scanner.next();
                    System.out.println("Autor");
                    autor = scanner.next();
                    System.out.println("Pret");
                    pret = scanner.nextInt();
                    ACTIONS.addCarte(new CARTE(cantitate, editura, titlu, autor, pret));
                    break;
                case 2 :
                    ACTIONS.printCarti();
                    break;
                case 3 :
                    ACTIONS.clearCarti();
                    System.out.println("Cartile au fost sterse!");
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