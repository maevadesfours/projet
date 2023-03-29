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
public class Plat  {
    private String nomPlat;
    private int qtPlat;
    private String type; 
    private int id;
    
    public Plat (int id, String type, String nomPlat, int qtPlat) throws QuantityException {
        this.id = id; 
        this.type = type;
        this.nomPlat = nomPlat;
        if (qtPlat<0){
            throw new QuantityException("la quantité doit être positive");
        }
        this.qtPlat = qtPlat;
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public int getQtPlat() {
        return qtPlat;
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
    
    public JSONObject toJson() {
        
        JSONObject obj = new JSONObject();
        
        obj.put("id", id);
        obj.put("description", nomPlat);
        obj.put("qty", qtPlat);
        
        return obj;
    }
    
}