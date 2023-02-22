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
        this.setAlignmentX(CENTER_ALIGNMENT);
         JLabel resto = new JLabel ("El Ristaurante");
    
        resto.setBackground(Color.BLACK);
        resto.setOpaque(true);
        resto.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 20);
        resto.setForeground(Color.WHITE);
            resto.setFont(police);
            JLabel menu = new JLabel("Menu");
        this.add(resto);
        this.add(menu);
     } 
}
