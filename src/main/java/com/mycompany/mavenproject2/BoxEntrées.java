/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;



import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maevadesfours
 */
public class BoxEntrées extends Box{
    
   
    private Saisie saisie1;
    private Saisie saisie2;
    private Saisie saisie3;
    private Saisie saisie4;
    
    
    public BoxEntrées(){
        super(BoxLayout.PAGE_AXIS);
        
        JLabel entrées = new JLabel ("Les entrées");
    
        
        entrées.setOpaque(true);
        entrées.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 25);
        entrées.setFont(police);
            
        entrées.setAlignmentX(CENTER_ALIGNMENT);
        this.add(entrées);
        this.setUpAndDisplay();
        
        
      
     }
        
    public void setUpAndDisplay(){
        
        saisie1 = new Saisie();
        saisie2 = new Saisie();
        saisie3 = new Saisie();
        saisie4 = new Saisie();
       
   
        this.add(saisie1);
        this.add(saisie2);
        this.add(saisie3);
        this.add(saisie4);
        
        
        
    
    }
}
