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

//création d'un objet JSON 
//on le défini par son identifiant et sa quantité 
//il permet lors de la lecture du fichier que l'identifiant reconnu soit associé à sa quantité
// ce sera un JSONObject nommé OrderPart

public class OrderPart {
    Long id;
    Long qty;
    //on utilise des long et non des int
    
    public OrderPart(JSONObject obj){
        this.id = (Long)obj.get("id");//on récupère l'dentifiant dans le fichier JSON
        this.qty = (Long)obj.get("qty");//on récupère la quantité associée
    }
    @Override
    public String toString() {
        return "{id=" + id + ", qty=" + qty + '}';
    }
    //on retourne l'id et sa qt
    
    // on génère ensuite des guetters et setters
    public Long getId() {
        return id;
    }

    public Long getQty() {
        return qty;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }
    
}