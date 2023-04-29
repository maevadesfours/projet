/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
/**
 *
 * @author maevadesfours
 */
//PARTIE NORD DE L'INTERFACE GRAPHIQUE
public class Nord extends Box{
//utilisation d'une box pour regrouper les éléments choisis dans cet espace 
//soit ici 2 JLabel
    
    public Nord(){
        super(BoxLayout.PAGE_AXIS);// alignement vertical des éléments dans la box
        
        JLabel resto = new JLabel ("El Ristorante");// création d'une zone de texte
        
        resto.setBackground(Color.BLACK);//choix de la couleur (noir)
        resto.setOpaque(true);//ajout de l'opacité sinon les couleurs en fond ne fonctionnent pas sur mac
        resto.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));//dimension de la bordure du JLabel
        Font police = new Font("Courier New", Font.BOLD, 25);//création de la police 
        resto.setForeground(Color.WHITE);//couleur de l'écriture (blanc)
            resto.setFont(police);//ajout de la police précédement choisie  
            
        resto.setAlignmentX(CENTER_ALIGNMENT);//centrer le Jlabel 
        this.add(resto);//ajout du Jlabel dans la box Sud 
        
        
        JLabel menu = new JLabel("Saisissez le menu du jour : ");// création d'une seconde zone de texte
        
        menu.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));//dimension de la bordure du JLabel
        menu.setForeground(Color.BLACK);//couleur de l'écriture (noir)
            menu.setFont(police);//ajout de la police définie précédement
        menu.setAlignmentX(CENTER_ALIGNMENT);//centrer le Jlabel 
        this.add(menu);//ajout du Jlabel dans la box Sud, en dessous du Jlabel précédent 
        
     } 
}
