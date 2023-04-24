/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

/**
 *
 * @author maevadesfours
 */
public class BoxPlats extends Box{
//utilisation d'une box verticale pour faire apparaitre les éléments choisis les uns au-dessus des autres    
   
    private SaisieP saisie1;
    private SaisieP saisie2;
    private SaisiePoisson saisie3;
    
    
    public BoxPlats(){
        super(BoxLayout.PAGE_AXIS);//alignement des éléments verticalement
        // 1 Jlabel pour afficher le nom de la box: PLATS
        // ensuite affichage de 2 JPanel SaisieP puis 1 JPanel SaisiePoisson
        // pour permettre d'entrer le nom des plats et leurs quantités (idem pour le poisson)
        
        JLabel plats = new JLabel ("Les plats");
        //mise en forme de JLabel (choix police, couleur, taille...)
        plats.setOpaque(true);
        plats.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 25);
        plats.setFont(police);
            
        plats.setAlignmentX(CENTER_ALIGNMENT);//permet d'aligner correctement la box
        
        this.add(plats);
        this.setUpAndDisplay();
     }
    //affichage des 3 champs de saisie     
    public void setUpAndDisplay(){
        
        saisie1 = new SaisieP();
        saisie2 = new SaisieP();
        saisie3 = new SaisiePoisson();
        
        this.saisie1 = saisie1;
        this.saisie2 = saisie2;
        this.saisie3 = saisie3;
   
        this.add(saisie1);
        this.add(saisie2);
        this.add(saisie3);
        
    }
    //on place des guetters pour récupérer les données entrées dans les champs de saisies
    public SaisieP getSaisie1() {
        return saisie1;
    }

    public SaisieP getSaisie2() {
        return saisie2;
    }

    public SaisiePoisson getSaisie3() {
        return saisie3;
    }

}

