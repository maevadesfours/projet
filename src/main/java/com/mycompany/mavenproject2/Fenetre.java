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
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// création d'une JFrame fenêtre (c'est la fenêtre ouvrant l'interface graphique)
// permet de gérer les différentes fonctionnalitées utilisées lors de ce projet 

public class Fenetre extends JFrame {

    private Nord nord;
    private Sud sud;
    private Centre centre;
    private final ArrayList<Plat> starters = new ArrayList<>();
    private final ArrayList<Plat> main_courses = new ArrayList<>();
    private final ArrayList<Plat> desserts = new ArrayList<>();
    private Commande lireJson;

    public Fenetre() {
        super("el ristorante");
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {
        nord = new Nord();
        sud = new Sud();
        centre = new Centre();
        
        // MISE EN FORME DE L'INTERFACE 
        this.setLayout(new BorderLayout(10, 10));
        getContentPane().add(nord, BorderLayout.NORTH);// ajout de la Box nord au nord de l'interface
        getContentPane().add(sud, BorderLayout.SOUTH);// ajout de la Box Sud au sud de l'interface
        getContentPane().add(centre, BorderLayout.CENTER);// ajout de la Box Centre au centre de l'interface

        this.setTitle("El Ristorante");// nom de la fenêtre 
        this.setSize(1000, 700);// taille de la fenêtre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//arrêt de la JFrame "fenêtre" lorsqu'on sort de l'interface
        this.setLocationRelativeTo(null);
        this.setVisible(true);// permet d'être visible

        // programmmation du bouton ANNULE 
        // il remet chaque champs de saisie TextField à sa valeur initiale 
        // on utilise tous les guetters pour remonter au champs de saisis 
        // puis on remet le champs à sa valeur de départ  
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
        //programmation du bouton gestion des commandes par la fonction gestionCommandes() définie plus bas
        //lors de l'activation de ce bouton il va déclacher la fonction gestionCommandes()
        sud.getCde().addActionListener((e) -> {
            gestionCommandes();
        });

        // programmation du bouton VALIDE
        //dans une boucle try/catch
        sud.getValidé().addActionListener(e -> {

            try {
                //récupérer le nom et la qt des :
                //ENTREES 

                String nomEntree1 = centre.getBoxE().getSaisie1().getEntree().getText();
                //permet de retrouver le nom de l'entrée saisie par l'utilisateur 
                int qtEntree1 = Integer.parseInt(centre.getBoxE().getSaisie1().getQt().getText().trim());
                //permet de retrouver la quantité d'entrée saisie par l'utilisateur 
                // Integer.parseInt: permet d'avoir des entiers et non des string et enlève les espaces 

                //tester que l'utilisateur a bien saisi un plat, sinon il annule ce champs de saisie en mettant la qt=0
                if (nomEntree1.equalsIgnoreCase("Saisissez une entrée ")) {
                    qtEntree1 = 0;
                }
                //création d'un nouveau plat avec les variables récupérées précédement dans les champs de saisies de l'interface 
                Plat s1 = new Plat(1, "Entrée", nomEntree1, qtEntree1);
                // ajout du plat à l'arraylist contenant les entrées
                starters.add(s1);
                //code utilisé pour tester le bon fonctionnmenet des guetters
                //System.out.println(s1.toJson());

                //utilisation de la même méthode pour tous les plats suivants
                String nomEntree2 = centre.getBoxE().getSaisie2().getEntree().getText();
                int qtEntree2 = Integer.parseInt(centre.getBoxE().getSaisie2().getQt().getText().trim());

                if (nomEntree2.equalsIgnoreCase("Saisissez une entrée ")) {
                    qtEntree2 = 0;
                }
                Plat s2 = new Plat(2, "Entrée", nomEntree2, qtEntree2);
                starters.add(s2);

                String nomEntree3 = centre.getBoxE().getSaisie3().getEntree().getText();
                int qtEntree3 = Integer.parseInt(centre.getBoxE().getSaisie3().getQt().getText().trim());

                if (nomEntree3.equalsIgnoreCase("Saisissez une entrée ")) {
                    qtEntree3 = 0;
                }
                Plat s3 = new Plat(3, "Entrée", nomEntree3, qtEntree3);
                starters.add(s3);

                String nomEntree4 = centre.getBoxE().getSaisie4().getEntree().getText();
                int qtEntree4 = Integer.parseInt(centre.getBoxE().getSaisie4().getQt().getText().trim());

                if (nomEntree4.equalsIgnoreCase("Saisissez une entrée ")) {
                    qtEntree4 = 0;
                }
                Plat s4 = new Plat(4, "Entrée", nomEntree4, qtEntree4);
                starters.add(s4);

                //PLATS 
                String nomPlat1 = centre.getBoxP().getSaisie1().getPlats().getText();
                int qtPlat1 = Integer.parseInt(centre.getBoxP().getSaisie1().getQt().getText().trim());

                if (nomPlat1.equalsIgnoreCase("    Saisissez un plat     ")) {
                    qtPlat1 = 0;
                }
                Plat mc1 = new Plat(1, "Plat", nomPlat1, qtPlat1);
                //ajout à l'arraylist des plats 
                main_courses.add(mc1);

                String nomPlat2 = centre.getBoxP().getSaisie2().getPlats().getText();
                int qtPlat2 = Integer.parseInt(centre.getBoxP().getSaisie2().getQt().getText().trim());

                if (nomPlat2.equalsIgnoreCase("    Saisissez un plat     ")) {
                    qtPlat2 = 0;
                }

                Plat mc2 = new Plat(2, "Plat", nomPlat2, qtPlat2);
                main_courses.add(mc2);

                String nomPlat3 = centre.getBoxP().getSaisie3().getPoisson().getText();
                int qtPlat3 = Integer.parseInt(centre.getBoxP().getSaisie3().getQt().getText().trim());

                if (nomPlat3.equalsIgnoreCase("   Poisson du jour    ")) {
                    qtPlat3 = 0;
                }
                Plat mc3 = new Plat(3, "Plat", nomPlat3, qtPlat3);
                main_courses.add(mc3);

                //DESSERTS
                String nomDessert1 = centre.getBoxD().getSaisie1().getDesserts().getText();
                int qtDessert1 = Integer.parseInt(centre.getBoxD().getSaisie1().getQt().getText().trim());

                if (nomDessert1.equalsIgnoreCase(" Saisissez un dessert  ")) {
                    qtDessert1 = 0;
                }
                Plat d1 = new Plat(1, "Dessert", nomDessert1, qtDessert1);
                // ajout du plat à l'arraylist des desserts 
                desserts.add(d1);

                String nomDessert2 = centre.getBoxD().getSaisie2().getDesserts().getText();
                int qtDessert2 = Integer.parseInt(centre.getBoxD().getSaisie2().getQt().getText().trim());

                if (nomDessert2.equalsIgnoreCase(" Saisissez un dessert  ")) {
                    qtDessert2 = 0;
                }
                Plat d2 = new Plat(2, "Dessert", nomDessert2, qtDessert2);
                desserts.add(d2);

                String nomDessert3 = centre.getBoxD().getSaisie3().getDesserts().getText();
                int qtDessert3 = Integer.parseInt(centre.getBoxD().getSaisie3().getQt().getText().trim());

                if (nomDessert3.equalsIgnoreCase(" Saisissez un dessert  ")) {
                    qtDessert3 = 0;
                }
                Plat d3 = new Plat(3, "Dessert", nomDessert3, qtDessert3);
                desserts.add(d3);

                String nomDessert4 = centre.getBoxD().getSaisie4().getDesserts().getText();
                int qtDessert4 = Integer.parseInt(centre.getBoxD().getSaisie4().getQt().getText().trim());

                if (nomDessert4.equalsIgnoreCase(" Saisissez un dessert  ")) {
                    qtDessert4 = 0;
                }
                Plat d4 = new Plat(4, "Dessert", nomDessert4, qtDessert4);
                desserts.add(d4);

                try (PrintWriter out = new PrintWriter(new FileWriter("menu.json"))) {
                    // utilisation de PrintWriter (car FileWriter uniquement ne fonctionne pas sur mac)

                    //création d'un JSONObject
                    JSONObject json = new JSONObject();

                    //création d'une arraylist en JSON à laquelle on va ajouter chaqu'une des entrées
                    JSONArray s = new JSONArray();
                    s.add(s1.toJson());
                    s.add(s2.toJson());
                    s.add(s3.toJson());
                    s.add(s4.toJson());
                    // .toJson fait référence à la méthode toJson de la classe Plat
                    // elle permet d'écrire un plat sous forme d'object

                    json.put("starters", s);
                    //ajout de l'arraylist "s" écrite en Json à l'élément starters de l'object json

                    // même méthode que précédement
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

                    //écriture du fichier
                    json.writeJSONString(out);
                    out.close();

                } catch (Exception w) {
                    w.printStackTrace();
                }
            } catch (QuantityException x) {
                System.out.println(x);
                //exception pour vérifier que toutes les quantitées saisies soient bien des entiers
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(this, "les quantités doivent être des entiers");
                //fenêtre d'affiche du message d'erreur sur la console
            }
        });
    }

    public void gestionCommandes() {
        System.out.println("Dans la gestion des commandes");// dans la console 
        File rep = new File(System.getProperty("user.dir"));//choix du répertoire dans lequel il y a les fichiers à récupérer
        String[] commandes = rep.list((dir, name) -> name.matches("order_[0-9]+.json"));
        //recherche des fichiers commande qui sont nommés ("order_"nombre".json")
        
            for (String com : commandes) {
            Commande commande = new Commande(com);

            ArrayList<OrderPart> listeEntree = commande.getEntrees();// traitement de l'arraylist contenant les entrées
            //on utilise des JSONObject OrderPart pour traiter chaque plat  

            for (OrderPart entree : listeEntree) {
                Integer qt = entree.getQty().intValue();//on passe la quantité commandé sous forme d'entier
                for (Plat s : starters) {   //on traite chaque plat de l'arraylist starters
                    //MISE A JOUR DES QUANTITEES
                    if (entree.getId() == s.getId() && (qt <= s.getQtPlat()) && (qt > 0)) {
                        s.setQtPlat(s.getQtPlat() - qt);
                        
                        //si l'identifiant de l'entrée dans l'arraylist des entrées choisies par la cuisine 
                        //est identique à l'identifiant de l'entree saisie dans la commande la salle
                        // ET si la quantité commandé est bien inférieure à la quantité disponible
                        // ET si la quantité disponible est bien supérieure à 0 (éviter une quantité négative)
                        //ALORS : on met la quantité égale à la quantité initiale moins la quantité commandé 
                        
                        System.out.printf("Commande : %d %n   nom plat : %s %n   qté commandée : %d %n   qté restante : %d %n",
                                commande.getId(), s.getNomPlat(), qt, s.getQtPlat());
                                //affichage dans la console du suivi des commandes avec les quantités des plats mise à jour
                    } else if (entree.getId() == s.getId() && qt > 0) {
                        //si pour une même entrée la quantité de celle-ci est inférieure à 0
                        //on affiche que cette entrée est indisponible 
                        System.out.println("Entree : " + s.getNomPlat() + " --> NON DISPONIBLE");
                    }
                }
            }
            ArrayList<OrderPart> listePlat = commande.getPlats();
            // traitement de l'arraylist contenant les plats
            //MEME METHODE QUE PRECEDEMENT
            
            for (OrderPart plat : listePlat) {
                Integer qt2 = plat.getQty().intValue();
                for (Plat mc : main_courses) {
                    if (plat.getId() == mc.getId() && (qt2 <= mc.getQtPlat()) && (qt2 > 0)) {
                        mc.setQtPlat(mc.getQtPlat() - qt2);
                        System.out.printf("Commande : %d %n   nom plat : %s %n   qté commandée : %d %n   qté restante : %d %n",
                                commande.getId(), mc.getNomPlat(), qt2, mc.getQtPlat());
                    } else if (plat.getId() == mc.getId() && qt2 > 0) {
                        System.out.println("PLat : " + mc.getNomPlat() + " --> NON DISPONIBLE ");
                    }
                }
            }
            ArrayList<OrderPart> listeDessert = commande.getDesserts();
            // traitement de l'arraylist contenant les desserts
            //MEME METHODE QUE PRECEDEMENT
            
            for (OrderPart dessert : listeDessert) {
                Integer qt3 = dessert.getQty().intValue();
                for (Plat d : desserts) {
                    if (dessert.getId() == d.getId() && (qt3 <= d.getQtPlat()) && (qt3 > 0)) {
                        d.setQtPlat(d.getQtPlat() - qt3);
                        System.out.printf("Commande : %d %n   nom plat : %s %n   qté commandée : %d %n   qté restante : %d %n",
                                commande.getId(), d.getNomPlat(), qt3, d.getQtPlat());
                    } else if (dessert.getId() == d.getId() && qt3 > 0) {
                        System.out.println("Dessert : " + d.getNomPlat() + " --> NON DISPONIBLE");
                    }
                }
            }
        }
    }
}
