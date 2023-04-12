/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.white;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class Sud extends JPanel {
    //création d'un JPanel que l'on placera par la suite au sud de l'interface
    
    private JButton annulé;
    private JButton validé;
    private JButton commande;
    
    public Sud(){
   
        this.annulé = new JButton ("     Annuler     ");
        //création du bouton annulé sous forme de JButton

        annulé.setBackground(Color.RED);//choix de la couleur (rouge)
        annulé.setOpaque(true);//ajout de l'opacité sinon les couleurs ne fonctionnent pas sur mac
        annulé.setBorder(BorderFactory.createRaisedBevelBorder());//choix de la bordure du bouton
        Font police1 = new Font("Courier New", Font.BOLD, 23);//création de la police 
        annulé.setForeground(Color.BLACK);//couleur de l'écriture (noire)
            annulé.setFont(police1);//ajout de la police choisie précédement au bouton 
        this.add(annulé);//ajouter le bouton au Sud 
        
        //création du bouton validé
        // même méthode que précédement
        this.validé = new JButton ("    Valider le menu    ");
        
        validé.setBackground(Color.GREEN);
        validé.setOpaque(true);
        validé.setBorder(BorderFactory.createRaisedBevelBorder());
        validé.setForeground(Color.BLACK);
            validé.setFont(police1);
        
        this.add(validé);
        
        //création du bouton gestion des commandes
        // même méthode que précédement
        this.commande = new JButton("   Gestion commandes   ");
        
        commande.setBackground(Color.yellow);
        commande.setOpaque(true);
        commande.setBorder(BorderFactory.createRaisedBevelBorder());
        commande.setForeground(Color.BLACK);
            commande.setFont(police1);
        this.add(commande);
     } 

    //on génère les guetters pour détécter lorsque les bouttons sont déclanchés
    public JButton getAnnulé() {
        return annulé;
    }

    public JButton getValidé() {
        return validé;
    }

    public JButton getCde() {
        return commande;
    }
    
}
