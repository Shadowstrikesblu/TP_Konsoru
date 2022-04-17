package com.fges.ckonsoru;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class XMLDAO {
    public static XMLRequests creerRequete(){
        new XMLRequests();
        return null;
    }
    public static void displaycreneaux(){
        Scanner sc = new Scanner(System.in);
        String datecherchee = sc.nextLine();
        String partiesdates[] = datecherchee.split("/");
        XMLRequests test = new XMLRequests();
        test.afficherCreneaux(Integer.parseInt(partiesdates[2]), Integer.parseInt(partiesdates[1]), Integer.parseInt(partiesdates[0]));
    }
    public static void afficherrdv(){
        Scanner sc = new Scanner(System.in);
        String nomcli = sc.nextLine();
        XMLRequests test = new XMLRequests();
        test.afficheRDVCli(nomcli);
    }
    public static void prendrerdv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indiquer une date et heure de début au format JJ/MM/AAAA HH:MM (ex: 18/03/2021 15:00) :");
                String daterdv = sc.nextLine();
                System.out.println("Indiquer le nom du vétérinaire :");
                String nomveto = sc.nextLine();
                System.out.println("Indiquer le nom du client :");
                String nomcli = sc.nextLine();
        XMLRequests test = new XMLRequests();
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            Date parsedDate = dateFormat.parse(daterdv);
            Timestamp datetimestamp = new java.sql.Timestamp(parsedDate.getTime());
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(datetimestamp);
            test.AddRdv(timeStamp,nomveto,nomcli);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public  static void deleterdv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indiquer une date et heure de début au format JJ/MM/AAAA HH:MM (ex: 18/03/2021 15:00) :");
        String daterdv = sc.nextLine();
        System.out.println("Indiquer le nom du client :");
        String nomcli = sc.nextLine();
        XMLRequests test = new XMLRequests();
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            Date parsedDate = dateFormat.parse(daterdv);
            Timestamp datetimestamp = new java.sql.Timestamp(parsedDate.getTime());
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(datetimestamp);
            test.supprRdv(timeStamp, nomcli);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
