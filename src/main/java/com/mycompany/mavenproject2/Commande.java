/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author maevadesfours
 */
// création de la classe Commande 
// afin de récupérer les donnés founis dans les commandes recu par la salle 
public class Commande {
    String id;
    ArrayList<OrderPart> entrees;
    ArrayList<OrderPart> plats;
    ArrayList<OrderPart> desserts;
    String filename;//nom du fichier traité
    
    public Commande(String filename) {
        this.filename = filename;
        this.entrees = new ArrayList<>();
        this.plats = new ArrayList<>();
        this.desserts = new ArrayList<>();
        lireEntrees();
        LirePlat();
        LireDessert();
    }
    //méthode pour lire les entrées
    private void lireEntrees() {
        JSONParser jsonP = new JSONParser();//permet de passer d'un object à l'autre 
        try {
            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(filename));
            // nouvel object JSON récupéré à partir du fichier choisi (filename)
            
                this.id =(String) jsonO.get("id");// on récupère l'identifiant de la commande 
                System.out.println(id); 
            
            JSONArray starters = (JSONArray) jsonO.get("starters");//étude des donnés de starters dans une JSONArray
                                                                      //récupération des entrées 
            for (Object obj : starters) {
                OrderPart entree = new OrderPart((JSONObject) obj);//on passe chaque object du fichier  
                                                                   //sous la forme d'un OrderPart 
                                                                   //pour pouvoir ensuite utiliser ces données
                this.entrees.add(entree);//ajout de l'entree dans l'arraylist
                System.out.println(entree);
            }
            
            //gestion des exceptions 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    // même méthode pour les PLATS  
    private void LirePlat() {
        JSONParser jsonP = new JSONParser();
        try {
            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(filename));

            JSONArray main_courses = (JSONArray) jsonO.get("main_courses");
                                                                      //étude des donnés de main_courses dans une JSONArray
                                                                      //récupération des plats
            for (Object obj : main_courses) {
                OrderPart plats = new OrderPart((JSONObject) obj);
                this.plats.add(plats);
                System.out.println(plats);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    // même méthode pour les DESSERTS
    private void LireDessert() {
        JSONParser jsonP = new JSONParser();
        try {
            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(filename));

            JSONArray desserts = (JSONArray) jsonO.get("desserts");//étude des donnés de desserts dans une JSONArray
                                                                      //récupération des desserts
            for (Object obj : desserts) {
                OrderPart dessert = new OrderPart((JSONObject) obj);
                this.desserts.add(dessert);
                System.out.println(dessert);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    //génération des guetters 
    public String getId() {
        return id;
    }

    public ArrayList<OrderPart> getEntrees() {
        return entrees;
    }

    public ArrayList<OrderPart> getPlats() {
        return plats;
    }

    public ArrayList<OrderPart> getDesserts() {
        return desserts;
    }

}
