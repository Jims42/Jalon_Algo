package Jalon_22_12_25.Corrections_et_Tests;

import java.util.Scanner;

public class Probleme_02_Cor {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int compte = 3000;
        int retrait;
        int decouvert = -500;
        boolean reponse = true;

        System.out.println("Bonjour, vous avez " + compte + " Euros dans votre compte");
        try {

            while (reponse && compte > decouvert) {
                
                System.out.println("Combien voulez-vous retirer ?");

                retrait = clavier.nextInt();
                clavier.nextLine();

                if (retrait % 10 != 0) {
                    System.out.println("!!!ERREUR!!!\nVous pouvez retirer que par tranche de 10");
                    continue;
                }

                if (compte - retrait < decouvert) {
                    System.out.println("Vous avez depasser le decouvert autorise");
                    continue;
                }
                compte -= retrait;
                System.out.println("Il vous reste " + compte + " Euros");
                if (compte == decouvert) {
                    System.out.println("Votre compte est à découvert maximum. Plus de retraits possibles.");
                    break;
                }
                boolean question = false;
                while (!question) {

                    System.out.println("Voulez-vous retirer à nouveau ?");
                    String reponse1 = clavier.nextLine().trim().toLowerCase();

                    if (reponse1.equals("true") || reponse1.equals("oui") || reponse1.equals("o")) {
                        reponse = true;
                        question = true;
                    }

                    else if (reponse1.equals("false") || reponse1.equals("non") || reponse1.equals("n")) {
                        reponse = false;
                        question = true;
                        System.out.println("Merci de votre visite,\nBonne journée, au revoir.");

                    } else
                        System.out.println("Veuillez donner une réponse valide (oui) ou (non)");

                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erreur de saisie");
            clavier.next();
            
        }
        if (compte == decouvert) {
            System.out.println("Votre compte est vide (découvert maximum atteint).");

        }
        System.out.println("Fin du programme");
        clavier.close();
    }

}
