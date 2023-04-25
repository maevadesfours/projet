/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author maevadesfours
 */
public class SaisieP extends JPanel {
//création du JPanel Saisie pour entrer le nom du plat et sa quantité     
//constitué de 2 JTextField     
    private JTextField plats;
    private JTextField qt;
    
    public SaisieP(){
        //création du JTextField pour le nom 
        JTextField plats = new JTextField ("    Saisissez un plat     ");
        
        // style du JTextField
        plats.setBackground(Color.GRAY);
        plats.setOpaque(true);
        plats.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        this.add(plats);
        this.plats = plats;
        
        //création du JTextField pour la quantité 
        JTextField quantité = new JTextField ("Qt ");
       
        // style du JTextField 
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        this.add(quantité);
        this.qt=quantité;
    }
    
     //guetters pour récupérer les données entrées dans les champs de saisies
    public JTextField getPlats() {
        return plats;
    }
    public JTextField getQt() {
        return qt;
    }
}
