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
    //création du JPanel SaisieD pour entrer le nom du dessert et sa quantité     
    //constitué de 2 JTextField 
    private JTextField desserts;
    private JTextField qt;
    
    public SaisieD(){
        //création du JTextField pour le nom 
        JTextField desserts = new JTextField (" Saisissez un dessert  ");
        
        // style du JTextField
        desserts.setBackground(Color.GRAY);
        desserts.setOpaque(true);
        desserts.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        this.add(desserts);
        this.desserts=desserts;
        
        //création du JTextField pour la quantité 
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
         
        // style du JTextField
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        this.add(quantité);
        this.qt=quantité;
    }
    
    //guetters pour récupérer les données entrées dans les champs de saisies
    public JTextField getDesserts() {
        return desserts;
    }
    public JTextField getQt() {
        return qt;
    }
}