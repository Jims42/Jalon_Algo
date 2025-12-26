package Jalon_22_12_25.Corrections_et_Tests;

import java.util.Scanner;

public class probleme_03_corrige_bberamis {
    //suggestion de corrigé APRES EXAMEN
    public static void main(String[] args) {


    Scanner clavier = new Scanner(System.in);
        int a;
        int i = 0;

        System.out.println("Combien voulez-vous compter en puissance de 2 ? ");
        a = clavier.nextInt();

        while (i <= a) {

            double resultat = Math.pow(2, i);

            System.out.println("2 puissance " + i + " = " + resultat);

            i++;

        }

        /* for(int j = 0; j<=a; j++){
            double resultat = Math.pow(2, j);

            System.out.println("2 puissance " + j + " = " + resultat);

        } */

        clavier.close();
    }
}
