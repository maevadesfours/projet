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
    //création du champ de saisie du poisson 
    //c'est un JPanel composé de 2 JTextField (un pour le nom et un pour la qt) 
    private JTextField poisson;
    private JTextField qt;
    
    public SaisiePoisson(){
        //création du JTextField pour le nom 
        JTextField poisson = new JTextField ("   Poisson du jour    ");
        poisson.setLayout(new FlowLayout());
        //design du JTextField  
        poisson.setBackground(Color.GRAY);
        poisson.setOpaque(true);
        poisson.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));
        
        this.add(poisson);
        this.poisson=poisson;
        
        //création du JTextField pour la quantité 
        JTextField quantité = new JTextField ("Qt ");
        quantité.setLayout(new FlowLayout());
        //design du JTextField
        quantité.setBackground(Color.GRAY);
        quantité.setOpaque(true);
        quantité.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        this.add(quantité);
        this.qt=quantité;
    }
    //guetters pour récupérer les données entrées dans les champs de saisies
    public JTextField getPoisson() {
        return poisson;
    }

    public JTextField getQt() {
        return qt;
    }
    
}

