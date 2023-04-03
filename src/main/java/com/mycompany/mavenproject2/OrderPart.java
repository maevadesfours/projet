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
public class OrderPart {
    Long id;
    Long qty;
    
    public OrderPart(JSONObject obj){
        this.id = (Long)obj.get("id");
        this.qty = (Long)obj.get("qty");
               
}

    @Override
    public String toString() {
        return "{id=" + id + ", qty=" + qty + '}';
    }

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