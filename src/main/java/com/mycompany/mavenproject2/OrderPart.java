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
    int id;
    int qty;
    
    public OrderPart(JSONObject obj){
        this.id = (int)obj.get("id");
        this.qty = (int)obj.get("qty");
               
}

    @Override
    public String toString() {
        return "OrderPart{" + "id=" + id + ", qty=" + qty + '}';
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}