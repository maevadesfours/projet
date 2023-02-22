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
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
    

    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("Interface");
    private Nord nord ; 
    
    
    public Fenetre(){
        super("el ristorante");
        this.setUpAndDisplay();
     }
        
    public void setUpAndDisplay(){
        nord = new Nord();
  
    this.setLayout(new BorderLayout(10,10));
        getContentPane().add(nord, BorderLayout.NORTH);
    
    
        
    this.setTitle("El Ristorante");
    this.setSize(1000, 1000);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    //On définit le layout à utiliser sur le content pane
    
    /*
    //On ajoute le bouton au content pane de la JFrame
    //Au centre
    JButton plats = new JButton ("PLATS");
    this.getContentPane().add(plats,BorderLayout.CENTER);
    plats.setBackground(yellow);
    plats.setOpaque(true);
    plats.setBorderPainted(false);
    plats.setPreferredSize(new Dimension(55, 55));
    this.setVisible(true);
    
   
    
    //Au nord
    this.getContentPane().add(new JButton("El Ristorante"), BorderLayout.NORTH);
    //Au sud
    this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
    //À l'ouest
    this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);
    //À l'est
    this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
    this.setVisible(true);
    
    
    /*private void MettreZero(){
    //On définit la police d'écriture à utiliser
    Font police = new Font("Arial", Font.BOLD, 20);
    bouton = new JLabel("0");
    pan.setFont(police);*/
    
    /*private JLabel label(String content, Font font) {
        JLabel jLabel = new JLabel(content);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
            if (font != null) {
            jLabel.setFont(font);
            } 
        return jLabel;
        }
    /*On aligne les informations à droite dans le JLabel
    pan.setHorizontalAlignment(JLabel.RIGHT);
    pan.setPreferredSize(new Dimension(1000, 1000));
    JPanel jb1 = new JPanel();      
    */
    
    
    }
  
  } 
    

    

