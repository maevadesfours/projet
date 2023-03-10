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
public class SaisieD extends JPanel {
    
    private JTextField desserts;
    private JTextField qt;
    
    public SaisieD(){
       
        JTextField desserts = new JTextField (" Saisissez un dessert  ");
        desserts.setLayout(new FlowLayout());
         
        desserts.setBackground(Color.GRAY);
        desserts.setOpaque(true);
        desserts.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        
        this.add(desserts);
        this.desserts=desserts;
        
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
         
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        
        this.add(quantité);
        this.qt=quantité;
    }

    public JTextField getDesserts() {
        return desserts;
    }

    
    

    public JTextField getQt() {
        return qt;
    }
    
}