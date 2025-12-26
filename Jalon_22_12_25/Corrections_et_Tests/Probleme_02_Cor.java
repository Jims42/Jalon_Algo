package Jalon_22_12_25.Corrections_et_Tests;

import java.util.Scanner;

public class Probleme_02_Cor {
     Scanner clavier = new Scanner(System.in);
        int compte = 3000;
        int retrait;
        boolean reponse = true;

        System.out.println("Bonjour, vous avez " + compte + " Euros dans votre compte");

        while (reponse) {
            System.out.println("Combien voulez-vous retirer ?");

            retrait = clavier.nextInt();

            if (retrait >= compte - 500) {
                System.out.println("Vous avez depasser le decouvert autorise");
            } else if (retrait % 10 != 0) {
                System.out.println("!!!ERREUR!!!\nVous pouvez retirer que par tranche de 10");
            } else
                compte -= retrait;

            System.out.println("Il vous reste " + compte);
            boolean reponse1=false;

            while (reponse1=true) {
                
           

            System.out.println("Voulez-vous retirer à nouveau ?");
            reponse1 = clavier.nextBoolean();
            if (reponse!=true||reponse1!=false) {System.out.println("Veuillez répondre par (true) ou (false) !"); reponse1=true;}
            else{reponse1=false;}
                
            }
            reponse1=reponse;
            if (reponse == false) {
                System.out.println("Merci de votre visite,\nBonne journée, au revoir.");
                break;
            }  else {
                reponse = true;
            }

        

        clavier.close();
    }
}

    
