/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

/**
 *
 * @author maevadesfours
 */
public class BoxDesserts extends Box{
    //utilisation d'une box verticale pour faire apparaitre les éléments choisis les uns au-dessus des autres
   
    private SaisieD saisie1;
    private SaisieD saisie2;
    private SaisieD saisie3;
    private SaisieD saisie4;
    
    public BoxDesserts(){
        super(BoxLayout.PAGE_AXIS);//alignement des éléments verticalement
        // 1 Jlabel pour afficher le nom de la box: DESSERT
        // ensuite affichage de 4 JPanel SaisieD
        // pour permettre d'entrer le nom des desserts et leurs quantités
        
        JLabel dessert = new JLabel ("Les desserts");
        //mise en forme de JLabel (choix police, couleur, taille...)
        dessert.setOpaque(true);
        dessert.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 25);
        dessert.setFont(police);
        dessert.setAlignmentX(CENTER_ALIGNMENT);//permet d'aligner correctement la box
        
        this.add(dessert);
        this.setUpAndDisplay();
        
     }
    //affichage des 4 champs de saisie     
    public void setUpAndDisplay(){
        
        saisie1 = new SaisieD();
        saisie2 = new SaisieD();
        saisie3 = new SaisieD();
        saisie4 = new SaisieD();
       
        this.saisie1 = saisie1;
        this.saisie2 = saisie2;
        this.saisie3 = saisie3;
        this.saisie4 = saisie4;
   
        this.add(saisie1);
        this.add(saisie2);
        this.add(saisie3);
        this.add(saisie4);
    }
    
    //on place des guetters pour récupérer les données entrées dans les champs de saisies
    public SaisieD getSaisie1() {
        return saisie1;
    }

    public SaisieD getSaisie2() {
        return saisie2;
    }

    public SaisieD getSaisie3() {
        return saisie3;
    }

    public SaisieD getSaisie4() {
        return saisie4;
    }
    
}
