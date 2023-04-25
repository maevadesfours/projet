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
public class Saisie extends JPanel {
//création du JPanel Saisie pour entrer le nom d'une entrée et sa quantité     
//constitué de 2 JTextField     
    private JTextField entree;
    private JTextField qt;
    
    public Saisie(){
        // premier JTextField pour la saisie du nom de l'entrée
        JTextField entrée = new JTextField ("Saisissez une entrée ");
        
        entrée.setBackground(Color.GRAY);
        entrée.setOpaque(true);
        entrée.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
       
        this.add(entrée);
        this.entree=entrée;
       
        // second JTextField pour la saisie de la quantité du plat
        JTextField quantité = new JTextField ("Qt ");
         
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        this.add(quantité);
        this.qt=quantité;
        
    //guetters pour récupérer les données entrées dans les champs de saisies
    }
    public JTextField getEntree() {
        return entree;
    }
    public JTextField getQt() {
        return qt;
    }
}
