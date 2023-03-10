/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

/**
 *
 * @author maevadesfours
 */
public class BoxPlats extends Box{
    
   
    private SaisieP saisie1;
    private SaisieP saisie2;
    private SaisiePoisson saisie3;
    
    
    
    public BoxPlats(){
        super(BoxLayout.PAGE_AXIS);
        
        JLabel plats = new JLabel ("Les plats");
    
        
        plats.setOpaque(true);
        plats.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 25);
        plats.setFont(police);
            
        plats.setAlignmentX(CENTER_ALIGNMENT);
        this.add(plats);
        this.setUpAndDisplay();
     }
        
    public void setUpAndDisplay(){
        
        saisie1 = new SaisieP();
        saisie2 = new SaisieP();
        saisie3 = new SaisiePoisson();
        
        this.saisie1 = saisie1;
        this.saisie2 = saisie2;
        this.saisie3 = saisie3;
   
        this.add(saisie1);
        this.add(saisie2);
        this.add(saisie3);
        
    }

    public SaisieP getSaisie1() {
        return saisie1;
    }

    public SaisieP getSaisie2() {
        return saisie2;
    }

    public SaisiePoisson getSaisie3() {
        return saisie3;
    }
    
    
}

