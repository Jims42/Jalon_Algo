package Jalon_22_12_25.Corrections_et_Tests;

import java.util.Scanner;

public class Exo2_Franck {
     public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int compte = 3000;
        int retrait;
        int decouvert = -500;
        boolean reponse = false;

        
do{
        System.out.println("Bonjour, vous avez " + compte + " Euros dans votre compte");



        do {

            System.out.println("Combien voulez-vous retirer ?");

            try {
                retrait = clavier.nextInt();
                clavier.nextLine();

                if (retrait % 10 != 0) {
                    System.out.println("Vous devez saisir un multiple de 10");
                    reponse = false;
                } else {
                    if (retrait > compte + decouvert) {
                        System.out.println("Vous avez dépassé le découvert autorisé");
                        reponse = false;
                    } else {

                        reponse = true;
                    }

                }

            } catch (Exception e) {

                System.out.println("Erreur de saisie");
                System.out.println(e.getMessage());
                clavier.next();

            }

        } while (!reponse);
          compte -= retrait;


       
         

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
 while (!question);
       
       
        if (compte == decouvert) {
            System.out.println("Votre compte est vide (découvert maximum atteint).");

        }
        System.out.println("Fin du programme");
        clavier.close();
    }

}

