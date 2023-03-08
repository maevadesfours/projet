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
public class SaisiePoisson extends JPanel {
    
    public SaisiePoisson(){
       
        JTextField plats = new JTextField ("   Poisson du jour    ");
        plats.setLayout(new FlowLayout());
         
        plats.setBackground(Color.GRAY);
        plats.setOpaque(true);
        plats.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        
        this.add(plats);
        
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
         
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        
        this.add(quantité);
    }
}

