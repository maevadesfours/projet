/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class BoxDesserts extends Box{
    
   
    private SaisieD saisie1;
    private SaisieD saisie2;
    private SaisieD saisie3;
    private SaisieD saisie4;
    
    
    public BoxDesserts(){
        super(BoxLayout.PAGE_AXIS);
        
        
        JLabel plats = new JLabel ("Les desserts");
    
        
        plats.setOpaque(true);
        plats.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 25);
        plats.setFont(police);
            
        //plats.setAlignmentX(CENTER_ALIGNMENT);
        this.add(plats);
        
        this.setUpAndDisplay();
        
     }
        
    public void setUpAndDisplay(){
        
        saisie1 = new SaisieD();
        saisie2 = new SaisieD();
        saisie3 = new SaisieD();
        saisie4 = new SaisieD();
       
        this.saisie1 = saisie1;
        this.saisie2 = saisie2;
        this.saisie3 = saisie3;
        this.saisie4 = saisie4;
   
        this.add(saisie1);
        this.add(saisie2);
        this.add(saisie3);
        this.add(saisie4);
        
    
    }

    public SaisieD getSaisie1() {
        return saisie1;
    }

    public SaisieD getSaisie2() {
        return saisie2;
    }

    public SaisieD getSaisie3() {
        return saisie3;
    }

    public SaisieD getSaisie4() {
        return saisie4;
    }
    
}
