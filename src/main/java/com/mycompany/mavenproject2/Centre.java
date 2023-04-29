/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.swing.Box;
import javax.swing.BoxLayout;
/**
 *
 * @author maevadesfours
 */
//création d'une box centrale dans laquelle on placera des éléments choisi pour constituer le centre de l'interface
public class Centre extends Box {
    
    private BoxEntrées BoxE;
    private BoxPlats BoxP;
    private BoxDesserts BoxD;
    
    // ajout des 3 box entrées, plats et desserts dans la box centre 
    // on les aligne horizontalement 
    public Centre(){
        super(BoxLayout.LINE_AXIS);//alignement horizontal 
        this.setUpAndDisplay();
    }    
    public void setUpAndDisplay(){
      
        BoxE = new BoxEntrées();
        BoxP = new BoxPlats();
        BoxD = new BoxDesserts();
       
        this.BoxE = BoxE;
        this.BoxP = BoxP;
        this.BoxD = BoxD;
        
        this.add(BoxE);
        this.add(BoxP);
        this.add(BoxD);
        //ajout de ces 3 box dans la box centre 
    }
    // on récupère les données fournies dans les boxP, E et D
    public BoxEntrées getBoxE() {
        return BoxE;
    }
    public BoxPlats getBoxP() {
        return BoxP;
    }
    public BoxDesserts getBoxD() {
        return BoxD;
    }
 }
