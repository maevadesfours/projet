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
import java.io.PrintWriter;
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
import org.json.simple.parser.JSONParser;

public class Fenetre extends JFrame {

    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("MON RESTAURANT");
    private Nord nord;
    private Sud sud;
    private Centre centre;
    private final ArrayList<Plat> starters = new ArrayList<>();
    private final ArrayList<Plat> main_courses = new ArrayList<>();
    private final ArrayList<Plat> desserts = new ArrayList<>();
    private LireJson lireJson;

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
                //récupérer le nom et la qt des :
                //ENTREES 

                String nomEntree1 = centre.getBoxE().getSaisie1().getEntree().getText();
                //permet de retrouver le nom de l'entrée saisie par l'utilisateur 
                int qtEntree1 = Integer.parseInt(centre.getBoxE().getSaisie1().getQt().getText().trim());
                //permet de retrouver la quantité d'entrée saisie par l'utilisateur 

                Plat s1 = new Plat(1, "Entrée", nomEntree1, qtEntree1);
                starters.add(s1);
                //code utilisé pour tester le bon fonctionnmenet des guetters
                //System.out.println(s1.toJson());

                String nomEntree2 = centre.getBoxE().getSaisie2().getEntree().getText();
                int qtEntree2 = Integer.parseInt(centre.getBoxE().getSaisie2().getQt().getText().trim());

                Plat s2 = new Plat(2, "Entrée", nomEntree2, qtEntree2);
                starters.add(s2);

                String nomEntree3 = centre.getBoxE().getSaisie3().getEntree().getText();
                int qtEntree3 = Integer.parseInt(centre.getBoxE().getSaisie3().getQt().getText().trim());

                Plat s3 = new Plat(3, "Entrée", nomEntree3, qtEntree3);
                starters.add(s3);

                String nomEntree4 = centre.getBoxE().getSaisie4().getEntree().getText();
                int qtEntree4 = Integer.parseInt(centre.getBoxE().getSaisie4().getQt().getText().trim());

                Plat s4 = new Plat(4, "Entrée", nomEntree4, qtEntree4);
                starters.add(s4);

                //PLATS 
                String nomPlat1 = centre.getBoxP().getSaisie1().getPlats().getText();
                int qtPlat1 = Integer.parseInt(centre.getBoxP().getSaisie1().getQt().getText().trim());

                Plat mc1 = new Plat(1, "Plat", nomPlat1, qtPlat1);
                main_courses.add(mc1);

                String nomPlat2 = centre.getBoxP().getSaisie2().getPlats().getText();
                int qtPlat2 = Integer.parseInt(centre.getBoxP().getSaisie2().getQt().getText().trim());

                Plat mc2 = new Plat(2, "Plat", nomPlat2, qtPlat2);
                main_courses.add(mc2);

                String nomPlat3 = centre.getBoxP().getSaisie3().getPoisson().getText();
                int qtPlat3 = Integer.parseInt(centre.getBoxP().getSaisie3().getQt().getText().trim());

                Plat mc3 = new Plat(3, "Plat", nomPlat3, qtPlat3);
                main_courses.add(mc3);

                //DESSERTS
                String nomDessert1 = centre.getBoxD().getSaisie1().getDesserts().getText();
                int qtDessert1 = Integer.parseInt(centre.getBoxD().getSaisie1().getQt().getText().trim());

                Plat d1 = new Plat(1, "Dessert", nomDessert1, qtDessert1);
                desserts.add(d1);

                String nomDessert2 = centre.getBoxD().getSaisie2().getDesserts().getText();
                int qtDessert2 = Integer.parseInt(centre.getBoxD().getSaisie2().getQt().getText().trim());

                Plat d2 = new Plat(2, "Dessert", nomDessert2, qtDessert2);
                desserts.add(d2);

                String nomDessert3 = centre.getBoxD().getSaisie3().getDesserts().getText();
                int qtDessert3 = Integer.parseInt(centre.getBoxD().getSaisie3().getQt().getText().trim());

                Plat d3 = new Plat(3, "Dessert", nomDessert3, qtDessert3);
                desserts.add(d3);

                String nomDessert4 = centre.getBoxD().getSaisie4().getDesserts().getText();
                int qtDessert4 = Integer.parseInt(centre.getBoxD().getSaisie4().getQt().getText().trim());

                Plat d4 = new Plat(4, "Dessert", nomDessert4, qtDessert4);
                desserts.add(d4);

                try (PrintWriter out = new PrintWriter(new FileWriter("menu.json"))) {
                    //FileWriter fichier = new FileWriter ("menu.json");
                    // utilisation de PrintWriter car FileWriter uniquement ne fonctionne pas sur mac

                    JSONObject json = new JSONObject();

                    JSONArray st = new JSONArray();
                    st.add(s1.toJson());
                    st.add(s2.toJson());
                    st.add(s3.toJson());
                    st.add(s4.toJson());

                    json.put("starters", st);

                    JSONArray mc = new JSONArray();
                    mc.add(mc1.toJson());
                    mc.add(mc2.toJson());
                    mc.add(mc3.toJson());

                    json.put("main_courses", mc);

                    JSONArray d = new JSONArray();
                    d.add(d1.toJson());
                    d.add(d2.toJson());
                    d.add(d3.toJson());
                    d.add(d4.toJson());

                    json.put("desserts", d);

                    json.writeJSONString(out);
                    // System.out.printf(JSON.toString());
                    out.close();

                } catch (Exception w) {
                    w.printStackTrace();
                }
                lireJson.LireJson();

                while (qtEntree1 >= 0) {
                    if (lireJson.jsonO.getId()=1){
                    

                    //tant que order de qt1 de la cuisine >=0
                    // si get qt1 de la salle > 0
                    // qt 1 - get qt1
                    // else, return "ce plat n'est plus disponible 
                    return;
                }
                }
            } catch (QuantityException ex) {
                Logger.getLogger(Fenetre.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

    }
}
