/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
import org.json.simple.JSONObject;
/**
 *
 * @author maevadesfours
 */
//création de la classe plat 
//permettant de définir les caractérisques d'un plat 
//chaque éléments étant des plats pourront ensuite être reconnu 
public class Plat  {
    private String nomPlat;
    private int qtPlat;
    private String type; 
    private int id;
    //chaque plat est défini par son nom, sa quantité, son type et son identifiant 
    
    public Plat (int id, String type, String nomPlat, int qtPlat) throws QuantityException {
        this.id = id; 
        this.type = type;
        this.nomPlat = nomPlat;
        if (qtPlat<0){
            throw new QuantityException("la quantité doit être positive");
            // ajout d'une exception sur les quantités 
            // cela permet de vérifier que les quantités saisies soient bien positives (ou nulles)
        }
        this.qtPlat = qtPlat;
        }
    
    //on génère des guetters et des setters 
    public String getNomPlat() {
        return nomPlat;
    }

    public int getQtPlat() {
        return qtPlat;
    }
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

    public void setQtPlat(int qtPlat) {
        this.qtPlat = qtPlat;
    }

    public void setType(String type) {
        this.type = type;
    }
    //on retourne chaque nouveau plat comme un JSONObject
    public JSONObject toJson() {
        
        JSONObject obj = new JSONObject();
        
        //caractéristiques pour identifier chaque object
        obj.put("id", id);
        obj.put("description", nomPlat);
        obj.put("qty", qtPlat);
        
        return obj;
    }
    
}