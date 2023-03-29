/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    JSONObject jsonO = (JSONObject)jsonP.parse(new FileReader("C:/restaurant_exemple_commande.json"));
    
         String id = (String)jsonO.get("id");
         String qty = (String)jsonO.get("qty");
         //String address = (String) jsonO.get("address");
         System.out.println("id :"+ id);
         System.out.println("qty: "+ qty);
         //System.out.println("Address: "+ address);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ParseException e) {
         e.printStackTrace();
      }
   }
    
}
