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
    
    
    public static void LireJson() {    
    JSONParser jsonP = new JSONParser();
    
    try {
    JSONObject jsonO = (JSONObject)jsonP.parse(new FileReader("restaurant_exemple_commande.json"));
        
        String id = (String)jsonO.get("id");
        System.out.println(id);
    
         JSONArray starters = (JSONArray) jsonO.get("starters");
            for (Object obj: starters){
                OrderPart entree = new OrderPart ((JSONObject) obj);
                System.out.println(entree);
             }   
        
         JSONArray main_courses = (JSONArray) jsonO.get("main_courses");
            for (Object obj: main_courses){
                OrderPart plats = new OrderPart ((JSONObject) obj);
                System.out.println(plats);
            }
            
        JSONArray desserts = (JSONArray) jsonO.get("desserts");
            for (Object obj: desserts){
                OrderPart dessert = new OrderPart ((JSONObject) obj);
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
    
}
