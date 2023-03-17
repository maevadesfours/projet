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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.ActiveEvent;
import java.util.ArrayList;


public class Fenetre extends JFrame{
    

    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("MON RESTAURANT");
    private Nord nord ;
    private Sud sud; 
    private Centre centre;
    private ArrayList<Plat> starters = new ArrayList<Plat>();
    private ArrayList<Plat> main_courses = new ArrayList<Plat>();
    private ArrayList<Plat> desserts = new ArrayList<Plat>();
    
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
    
    sud.getValidé().addActionListener(e -> {
        
        try {
        starters.add(new Plat (starters.size()+1,"Entrée",centre.getBoxE().getSaisie1().getEntree().getText(),Integer.parseInt(centre.getBoxE().getSaisie1().getQt().getText())));
        starters.add( new Plat (starters.size()+1,"Entrée",centre.getBoxE().getSaisie2().getEntree().getText(),Integer.parseInt(centre.getBoxE().getSaisie2().getQt().getText())));
        starters.add( new Plat (starters.size()+1,"Entrée",centre.getBoxE().getSaisie3().getEntree().getText(),Integer.parseInt(centre.getBoxE().getSaisie3().getQt().getText())));
        starters.add( new Plat (starters.size()+1,"Entrée",centre.getBoxE().getSaisie4().getEntree().getText(),Integer.parseInt(centre.getBoxE().getSaisie4().getQt().getText())));
        
        main_courses.add(new Plat (main_courses.size()+1,"Plat",centre.getBoxP().getSaisie1().getPlats().getText(),Integer.parseInt(centre.getBoxP().getSaisie1().getQt().getText())));
        main_courses.add(new Plat (main_courses.size()+1,"Plat",centre.getBoxP().getSaisie2().getPlats().getText(),Integer.parseInt(centre.getBoxP().getSaisie2().getQt().getText())));
        main_courses.add(new Plat (main_courses.size()+1,"Plat",centre.getBoxP().getSaisie3().getPoisson().getText(),Integer.parseInt(centre.getBoxP().getSaisie3().getQt().getText())));
    
        
        desserts.add(new Plat (desserts.size()+1,"Dessert",centre.getBoxD().getSaisie1().getDesserts().getText(),Integer.parseInt(centre.getBoxD().getSaisie1().getQt().getText())));
        desserts.add(new Plat (desserts.size()+1, "Dessert",centre.getBoxD().getSaisie2().getDesserts().getText(),Integer.parseInt(centre.getBoxD().getSaisie2().getQt().getText())));
        desserts.add(new Plat (desserts.size()+1,"Dessert",centre.getBoxD().getSaisie3().getDesserts().getText(),Integer.parseInt(centre.getBoxD().getSaisie3().getQt().getText())));
        desserts.add(new Plat (desserts.size()+1,"Dessert",centre.getBoxD().getSaisie4().getDesserts().getText(),Integer.parseInt(centre.getBoxD().getSaisie4().getQt().getText())));
        }
        
        catch (NumberFormatException n){
            System.out.println("les quantités doivent être des entiers");     
                }
        catch (QuantityException x){
            System.out.println(x);
        }
    });
    
  } 
}
  
