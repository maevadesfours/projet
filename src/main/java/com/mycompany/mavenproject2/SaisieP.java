/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maevadesfours
 */
public class SaisieP extends JPanel {
    
    private JTextField plats;
    private JTextField qt;
    
    public SaisieP(){
       
        JTextField plats = new JTextField ("    Saisissez un plat     ");
        plats.setLayout(new FlowLayout());
         
        plats.setBackground(Color.GRAY);
        plats.setOpaque(true);
        plats.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        
        this.add(plats);
        this.plats = plats;
        
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
         
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        
        this.add(quantité);
        this.qt=quantité;
    }

    public JTextField getPlats() {
        return plats;
    }

    public JTextField getQt() {
        return qt;
    }
    
}
