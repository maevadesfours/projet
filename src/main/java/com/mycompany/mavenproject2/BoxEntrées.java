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
public class BoxEntrées extends Box{
    //utilisation d'une box verticale pour faire apparaitre les éléments choisis les uns au-dessus des autres
   
    private Saisie saisie1;
    private Saisie saisie2;
    private Saisie saisie3;
    private Saisie saisie4;
    
    public BoxEntrées(){
        super(BoxLayout.PAGE_AXIS);//alignement des éléments verticalement
        // 1 Jlabel pour afficher le nom de la box: ENTREES
        // ensuite affichage de 4 JPanel SaisieE
        // pour permettre d'entrer le nom des enrées et leurs quantités
        
        JLabel entrées = new JLabel ("Les entrées");
        //mise en forme de JLabel (choix police, couleur, taille...)
        entrées.setOpaque(true);
        entrées.setBorder(BorderFactory.createEmptyBorder(15, 100, 15, 100));
        Font police = new Font("Arial", Font.BOLD, 25);
        entrées.setFont(police);
        entrées.setAlignmentX(CENTER_ALIGNMENT);//permet d'aligner correctement la box
        
        this.add(entrées);
        this.setUpAndDisplay();
     }
     //affichage des 4 champs de saisie        
    public void setUpAndDisplay(){
        
        saisie1 = new Saisie();
        saisie2 = new Saisie();
        saisie3 = new Saisie();
        saisie4 = new Saisie();
       
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
    public Saisie getSaisie1() {
        return saisie1;
    }

    public Saisie getSaisie2() {
        return saisie2;
    }

    public Saisie getSaisie3() {
        return saisie3;
    }

    public Saisie getSaisie4() {
        return saisie4;
    }
    
}
