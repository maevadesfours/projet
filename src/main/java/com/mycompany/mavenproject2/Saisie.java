/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maevadesfours
 */
public class Saisie extends JPanel {
    
    private JTextField entree;
    private JTextField qt;
    
    
    public Saisie(){
       
        JTextField entrée = new JTextField ("Saisissez une entrée ");
        entrée.setLayout(new FlowLayout());
         
        entrée.setBackground(Color.GRAY);
        entrée.setOpaque(true);
        entrée.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        /*Font police = new Font("Arial", Font.PLAIN, 20);
        entrée.setForeground(Color.BLACK);
            entrée.setFont(police);*/
        
        this.add(entrée);
        this.entree=entrée;
        
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
         
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        /*Font police = new Font("Arial", Font.PLAIN, 20);
        entrée.setForeground(Color.BLACK);
            entrée.setFont(police);*/
        
        this.add(quantité);
        this.qt=quantité;
    }

    public JTextField getEntree() {
        return entree;
    }

    public JTextField getQt() {
        return qt;
    }
    
}
