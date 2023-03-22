/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author maevadesfours
 */
import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;
import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Fenetre extends JFrame {

    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("MON RESTAURANT");
    private Nord nord;
    private Sud sud;
    private Centre centre;
    private final ArrayList<Plat> starters = new ArrayList<>();
    private final ArrayList<Plat> main_courses = new ArrayList<>();
    private final ArrayList<Plat> desserts = new ArrayList<>();

    public Fenetre() {
        super("el ristorante");
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {
        nord = new Nord();
        sud = new Sud();
        centre = new Centre();

        this.setLayout(new BorderLayout(10, 10));
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
                Plat s1 = new Plat(starters.size() + 1, "Entrée", centre.getBoxE().getSaisie1().getEntree().getText(), Integer.parseInt(centre.getBoxE().getSaisie1().getQt().getText().trim()));
                starters.add(s1);
                //System.out.println(s1.toJson());
                Plat s2 = new Plat(starters.size() + 1, "Entrée", centre.getBoxE().getSaisie2().getEntree().getText(), Integer.parseInt(centre.getBoxE().getSaisie2().getQt().getText().trim()));
                starters.add(s2);
                Plat s3 = new Plat(starters.size() + 1, "Entrée", centre.getBoxE().getSaisie3().getEntree().getText(), Integer.parseInt(centre.getBoxE().getSaisie3().getQt().getText().trim()));
                starters.add(s3);
                Plat s4 = new Plat(starters.size() + 1, "Entrée", centre.getBoxE().getSaisie4().getEntree().getText(), Integer.parseInt(centre.getBoxE().getSaisie4().getQt().getText().trim()));
                starters.add(s4);

                main_courses.add(new Plat(main_courses.size() + 1, "Plat", centre.getBoxP().getSaisie1().getPlats().getText(), Integer.parseInt(centre.getBoxP().getSaisie1().getQt().getText().trim())));
                main_courses.add(new Plat(main_courses.size() + 1, "Plat", centre.getBoxP().getSaisie2().getPlats().getText(), Integer.parseInt(centre.getBoxP().getSaisie2().getQt().getText().trim())));
                main_courses.add(new Plat(main_courses.size() + 1, "Plat", centre.getBoxP().getSaisie3().getPoisson().getText(), Integer.parseInt(centre.getBoxP().getSaisie3().getQt().getText().trim())));

                desserts.add(new Plat(desserts.size() + 1, "Dessert", centre.getBoxD().getSaisie1().getDesserts().getText(), Integer.parseInt(centre.getBoxD().getSaisie1().getQt().getText().trim())));
                desserts.add(new Plat(desserts.size() + 1, "Dessert", centre.getBoxD().getSaisie2().getDesserts().getText(), Integer.parseInt(centre.getBoxD().getSaisie2().getQt().getText().trim())));
                desserts.add(new Plat(desserts.size() + 1, "Dessert", centre.getBoxD().getSaisie3().getDesserts().getText(), Integer.parseInt(centre.getBoxD().getSaisie3().getQt().getText().trim())));
                desserts.add(new Plat(desserts.size() + 1, "Dessert", centre.getBoxD().getSaisie4().getDesserts().getText(), Integer.parseInt(centre.getBoxD().getSaisie4().getQt().getText().trim())));
                
                
                FileWriter fichier = new FileWriter ("menu.json");
                
                
                JSONObject json = new JSONObject();
                 
                JSONArray st = new JSONArray();
                st.add(s1.toJson());
                st.add(s2.toJson());
                st.add(s3.toJson());
                st.add(s4.toJson());
                json.put("starters", st);
                
                json.writeJSONString(fichier);
               
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(this, "les quantités doivent être des entiers");
            } catch (QuantityException x) {
                System.out.println(x);
            } catch (IOException ex) {
                Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        });
        

    }
}
