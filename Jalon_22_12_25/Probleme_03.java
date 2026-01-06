package Jalon_22_12_25;

import java.util.Scanner;

public class Probleme_03 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int a;
        int i = 0;

        System.out.println("Combien voulez-vous compter en puissance de 2 ? ");
        a = clavier.nextInt();

        while (i <= a) {

            if (a != i) {
                double resultat = Math.pow(2, i);
                i++;

                System.out.println("2 puissance " + i + " = " + resultat);
            }

            clavier.close();
        }
    }

}
