package Jalon_22_12_25;

import java.util.Scanner;

public class Probleme_01 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        boolean a;
        boolean b;
        boolean c;
        System.out.println("Entrer la valeur de A : ");
        a=clavier.nextBoolean();
        System.out.println("Entrer la valeur de B : ");
        b=clavier.nextBoolean();
         System.out.println("Entrer la valeur de C : ");
          c=clavier.nextBoolean();
          boolean resultat=a||b&&(!c);

          System.out.println("Le resultat de (a||b&&!c) est :"+resultat);
         clavier.close();
            
       
          }
    }
    

