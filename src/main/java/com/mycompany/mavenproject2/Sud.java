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
    
    public Sud(){
       
        JButton valider = new JButton ("Valider le menu");
        valider.setLayout(new FlowLayout());
         
        valider.setBackground(Color.GREEN);
        valider.setOpaque(true);
        valider.setBorder(BorderFactory.createEmptyBorder(10, 70, 10, 70));
        Font police = new Font("Courier New", Font.BOLD, 20);
        valider.setForeground(Color.BLACK);
            valider.setFont(police);
        
        this.add(valider);
        this.validé = valider;
        
   
        JButton annuler = new JButton ("Annuler");
        annuler.setLayout(new FlowLayout());
        
        annuler.setBackground(Color.RED);
        annuler.setOpaque(true);
        annuler.setBorder(BorderFactory.createEmptyBorder(10, 70, 10, 70));
        Font police1 = new Font("Courier New", Font.BOLD, 20);
        annuler.setForeground(Color.BLACK);
            annuler.setFont(police1);
        annuler.setLayout(new FlowLayout());
        this.add(annuler);
        this.annulé = annuler;
        
        
     } 

    public JButton getAnnulé() {
        return annulé;
    }

    public JButton getValidé() {
        return validé;
    }
    
}
