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
public class LireJson {
    
    JSONObject OrderPart orderpart;
    
    public static void LireJson() {    
    JSONParser jsonP = new JSONParser();
    
    try {
    JSONObject jsonO = (JSONObject)jsonP.parse(new FileReader("restaurant_exemple_commande.json"));
    
         JSONArray starters = JSONArray.get("starters");
            for (JSONObject obj: starters){
                OderPart entree = new OderPart (obj);
                System.out.println(OderPart);
            }
         
         System.out.println("id :"+ id);
         System.out.println("qty: "+ qty);
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ParseException e) {
         e.printStackTrace();
      }
    
    
   }
    
}
