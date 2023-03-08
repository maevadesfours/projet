/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class JPannel3 extends JPanel{
    
    private JButton button;
    private BoxDesserts BoxD;
    
    public JPannel3(){
    
        
        button = new JButton ();
        button.setBounds(40000,50000,1500000,1500000);
        button.setBackground(Color.MAGENTA);
        button.setOpaque(true);
        button.setBorderPainted(false);
       
        this.add(button);
        
        /*
        this.setUpAndDisplay();
    }
    public void setUpAndDisplay(){
        
        BoxD = new BoxDesserts();
        
        this.add(BoxD);*/
    }
}
