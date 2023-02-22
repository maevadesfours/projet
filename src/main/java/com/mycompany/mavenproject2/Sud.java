/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import static java.awt.Color.green;
import static java.awt.Color.white;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class Sud extends JPanel{
    public Sud(){
        JButton validé = new JButton ("Validé");
    
        validé.setBackground(green);
        validé.setOpaque(true);
        validé.setBorderPainted(false);
        validé.setPreferredSize(new Dimension(100, 50));
        validé.setVisible(true); 
     } 
}
