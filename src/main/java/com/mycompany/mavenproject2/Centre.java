/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class Centre extends Box {
    
    private BoxEntrées BoxE;
    private BoxPlats BoxP;
    private BoxDesserts BoxD;
    
    
    public Centre(){
        super(BoxLayout.LINE_AXIS);
        this.setUpAndDisplay();
        
        JPanel panel = new JPanel ();
        panel.setBounds(40,50,150,150);
        panel.setBackground(Color.MAGENTA);
        
        this.add(panel);
    }    
        
    public void setUpAndDisplay(){
      
        BoxE = new BoxEntrées();
        BoxP = new BoxPlats();
        BoxD = new BoxDesserts();
       
       
        this.add(BoxE);
        this.add(BoxP);
        this.add(BoxD);
        
    }
}
