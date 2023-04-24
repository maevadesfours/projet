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
    //private JPannel3 JP3;
    
    public Centre(){
        super(BoxLayout.LINE_AXIS);
        this.setUpAndDisplay();
        
        //j'ai essayer de 
        /*
        panel = new JPanel ();
        panel.setBounds(40,50,150,150);
        panel.setBackground(Color.MAGENTA);
        panel.setOpaque(true);
        //panel.setBorderPainted(false);
        this.add(panel);*/
        
    }    
        
    public void setUpAndDisplay(){
      
        BoxE = new BoxEntrées();
        BoxP = new BoxPlats();
        BoxD = new BoxDesserts();
        //JP3 = new JPannel3();
       
        this.BoxE = BoxE;
        this.BoxP = BoxP;
        this.BoxD = BoxD;
        
        this.add(BoxE);
        this.add(BoxP);
        this.add(BoxD);
        //this.add(JP3);
        
    }

    public BoxEntrées getBoxE() {
        return BoxE;
    }

    public BoxPlats getBoxP() {
        return BoxP;
    }

    public BoxDesserts getBoxD() {
        return BoxD;
    }
 
}
