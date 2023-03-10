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
    
    private JTextField poisson;
    private JTextField qt;
    
    public SaisiePoisson(){
       
        JTextField poisson = new JTextField ("   Poisson du jour    ");
        poisson.setLayout(new FlowLayout());
         
        poisson.setBackground(Color.GRAY);
        poisson.setOpaque(true);
        poisson.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        
        this.add(poisson);
        this.poisson=poisson;
        
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
         
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        
        this.add(quantité);
        this.qt=quantité;
    }

    public JTextField getPoisson() {
        return poisson;
    }

    public JTextField getQt() {
        return qt;
    }
    
}

