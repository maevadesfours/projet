/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author maevadesfours
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
    

    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("MON RESTAURANT");
    private Nord nord ;
    private Sud sud; 
    private Centre centre;
    
    
    public Fenetre(){
        super("el ristorante");
        this.setUpAndDisplay();
     }
        
    public void setUpAndDisplay(){
        nord = new Nord();
        sud = new Sud();
        centre = new Centre();
        
        
    this.setLayout(new BorderLayout(10,10));
        getContentPane().add(nord, BorderLayout.NORTH);
        getContentPane().add(sud, BorderLayout.SOUTH);
        getContentPane().add(centre, BorderLayout.CENTER);
        
    
        
    this.setTitle("El Ristorante");
    this.setSize(1000, 1000);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
    }
  
  } 
    

    

