/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class Nord extends Box{
    
    public Nord(){
        super(BoxLayout.PAGE_AXIS);
        
        JLabel resto = new JLabel ("El Ristaurante");
    
        resto.setBackground(Color.BLACK);
        resto.setOpaque(true);
        resto.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Courier New", Font.BOLD, 25);
        resto.setForeground(Color.WHITE);
            resto.setFont(police);
            
        resto.setAlignmentX(CENTER_ALIGNMENT);
        this.add(resto);
        
        JLabel menu = new JLabel("Saisissez le menu du jour : ");
        menu.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        Font police1 = new Font("Courier New", Font.BOLD, 15);
        menu.setForeground(Color.BLACK);
            menu.setFont(police);
        menu.setAlignmentX(CENTER_ALIGNMENT);
        this.add(menu);
        
        
     } 
}
