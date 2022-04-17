/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fges.ckonsoru;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

/**
 * Launch the App
 * @author julie.jacques
 */
public class App {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // Pour la saisie clavier
        
        System.out.println("Bienvenue sur Clinique Konsoru !");
        
        // chargement de la configuration de la persistence
        ConfigLoader cf = new ConfigLoader();
        Properties properties = cf.getProperties();

        while(true){
            if(properties.getProperty("persistence").equals("xml")){
                XML.xml();
            }else{
                BDD.BDD();
            }
        }
    }
    
}
