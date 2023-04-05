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
public class Commande {
    int id;
    ArrayList<OrderPart> entrees;
    ArrayList<OrderPart> plats;
    ArrayList<OrderPart> desserts;
    String filename;
    
    public Commande(String filename) {
        this.filename = filename;
        this.entrees = new ArrayList<>();
        this.plats = new ArrayList<>();
        this.desserts = new ArrayList<>();
        lireEntrees();
        LirePlat();
        LireDessert();
    }

    private void lireEntrees() {
        JSONParser jsonP = new JSONParser();
        try {
            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(filename));

            this.id = Integer.parseInt((String) jsonO.get("id"));
            System.out.println(id);

            JSONArray starters = (JSONArray) jsonO.get("starters");
            for (Object obj : starters) {
                OrderPart entree = new OrderPart((JSONObject) obj);
                this.entrees.add(entree);
                System.out.println(entree);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void LirePlat() {
        JSONParser jsonP = new JSONParser();
        try {
            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(filename));

            JSONArray main_courses = (JSONArray) jsonO.get("main_courses");
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

    private void LireDessert() {
        JSONParser jsonP = new JSONParser();
        try {
            JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(filename));

            JSONArray desserts = (JSONArray) jsonO.get("desserts");
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

    public int getId() {
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
