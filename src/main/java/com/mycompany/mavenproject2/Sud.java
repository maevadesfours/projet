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
    
    private JButton annulé;
    private JButton validé;
    private JButton commande;
    
    public Sud(){
   
        this.annulé = new JButton ("    Annuler    ");

        annulé.setBackground(Color.RED);
        annulé.setOpaque(true);
        annulé.setBorder(BorderFactory.createEmptyBorder(10, 70, 10, 70));
        Font police1 = new Font("Courier New", Font.BOLD, 20);
        annulé.setForeground(Color.BLACK);
            annulé.setFont(police1);
        annulé.setLayout(new FlowLayout());
        this.add(annulé);
        
        
        this.validé = new JButton ("Valider le menu");
        
        validé.setBackground(Color.GREEN);
        validé.setOpaque(true);
        validé.setBorder(BorderFactory.createEmptyBorder(10, 70, 10, 70));
        Font police = new Font("Courier New", Font.BOLD, 20);
        validé.setForeground(Color.BLACK);
            validé.setFont(police);
        
        this.add(validé);
        
        
        this.commande = new JButton("Gestion commandes");
        
        commande.setBackground(Color.yellow);
        commande.setOpaque(true);
        commande.setBorder(BorderFactory.createEmptyBorder(10, 70, 10, 70));
        Font police2= new Font("Courier New", Font.BOLD, 20);
        commande.setForeground(Color.BLACK);
            commande.setFont(police2);
        this.add(commande);
     } 

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
