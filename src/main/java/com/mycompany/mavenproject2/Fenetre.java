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
    
    sud.getAnnulé().addActionListener(l -> {
        centre.getBoxE().getSaisie1().getEntree().setText("Saisissez une entrée ");
        centre.getBoxE().getSaisie2().getEntree().setText("Saisissez une entrée ");
        centre.getBoxE().getSaisie3().getEntree().setText("Saisissez une entrée ");
        centre.getBoxE().getSaisie4().getEntree().setText("Saisissez une entrée ");
        
        centre.getBoxP().getSaisie1().getPlats().setText("    Saisissez un plat     ");
        centre.getBoxP().getSaisie2().getPlats().setText("    Saisissez un plat     ");
        centre.getBoxP().getSaisie3().getPoisson().setText("   Poisson du jour    ");
        
        centre.getBoxD().getSaisie1().getDesserts().setText("Saisissez un dessert ");
        centre.getBoxD().getSaisie2().getDesserts().setText("Saisissez un dessert ");
        centre.getBoxD().getSaisie3().getDesserts().setText("Saisissez un dessert ");
        centre.getBoxD().getSaisie4().getDesserts().setText("Saisissez un dessert ");
        
        
        
        centre.getBoxE().getSaisie1().getQt().setText("Qt ");
        centre.getBoxE().getSaisie2().getQt().setText("Qt ");
        centre.getBoxE().getSaisie3().getQt().setText("Qt ");
        centre.getBoxE().getSaisie4().getQt().setText("Qt ");
        
        centre.getBoxP().getSaisie1().getQt().setText("Qt ");
        centre.getBoxP().getSaisie2().getQt().setText("Qt ");
        centre.getBoxP().getSaisie3().getQt().setText("Qt ");
        
        
        centre.getBoxD().getSaisie1().getQt().setText("Qt ");
        centre.getBoxD().getSaisie2().getQt().setText("Qt ");
        centre.getBoxD().getSaisie3().getQt().setText("Qt ");
        centre.getBoxD().getSaisie4().getQt().setText("Qt ");
        
    });
    }
    sud.getAnnulé().addActionListener(l -> {
        String nomEntrée1 = centre.getBoxE().getSaisie1().getEntree().getText();
    
  } 
    

    

