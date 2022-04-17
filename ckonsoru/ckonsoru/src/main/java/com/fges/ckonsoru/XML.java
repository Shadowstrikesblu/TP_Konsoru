package com.fges.ckonsoru;

import java.util.Scanner;

public class XML {
    public static void quitter() {
        System.exit(0);
    }
    public static void xml() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Actions disponibles :");
        System.out.println("1. Afficher les créneaux disponibles pour une date donnée");
        System.out.println("2. Lister les rendez-vous passés, présent et à venir d'un client");
        System.out.println("3. Prendre un rendez-vous");
        System.out.println("4. Supprimer un rendez-vous");
        System.out.println("9. Quitter");
        String actionARealiser = "";
        while (actionARealiser.equals("1") == false && actionARealiser.equals("2") == false && actionARealiser.equals("3") == false && actionARealiser.equals("4") == false && actionARealiser.equals("9") == false) {
            if (actionARealiser.equals("") == false) {
                System.out.println("Veuillez choisir une action valide !");
            }
            System.out.println("Entrez l'action que vous souhaitez réaliser :");
            actionARealiser = sc.nextLine();
            if (actionARealiser.equals("1")) {
                System.out.println("De quel jour souhaitez-vous afficher les créneaux (de forme jj/mm/aaaa) ?");
                XMLDAO.displaycreneaux();
            } else if (actionARealiser.equals("2")) {
                System.out.println("Liste de rendez-vous d'un client.");
                System.out.println("Indiquer le nom du client :");
                XMLDAO.afficherrdv();
            } else if (actionARealiser.equals("3")) {
                System.out.println("Prise de rendez-vous.");
                XMLDAO.prendrerdv();
            } else if (actionARealiser.equals("4")) {
                System.out.println("Suppression d'un rendez-vous.");
                XMLDAO.deleterdv();
            } else if (actionARealiser.equals("9")) {
                quitter();
            }
        }
    }
}

