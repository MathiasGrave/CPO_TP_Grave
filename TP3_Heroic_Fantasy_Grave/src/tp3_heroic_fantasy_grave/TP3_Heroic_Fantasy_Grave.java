/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_grave;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author Grave
 */
public class TP3_Heroic_Fantasy_Grave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Baton Chene = new Baton ("Chêne", 4, 5);
        Baton Charme = new Baton("Chrame", 5, 6);
        ArrayList<Arme> armes = new ArrayList<Arme>();
        armes.add(Chene);
        armes.add(Charme);
        armes.add(Excalibur);
        armes.add(Durandal);
        int longueur=armes.size();
        for (int i=0; i<longueur; i++) {
            System.out.println("L'arme "+i+" est : "+armes.get(i));
        }
        Magicien Magicien1 = new Magicien("Gandalf", 65, true);
        Magicien Magicien2 = new Magicien("Garcimore", 44, false);
        Guerrier Guerrier1 = new Guerrier("Conan", 75, false);
        Guerrier Guerrier2 = new Guerrier("Lannister", 45, true);
        ArrayList<Personnage> perso = new ArrayList<Personnage>();
        perso.add(Guerrier1);
        perso.add(Guerrier2);
        perso.add(Magicien1);
        perso.add(Magicien2);
        int taille = perso.size();
        for (int j=0; j<taille; j++) {
            System.out.println("Le personnage "+j+" est : "+perso.get(j));
        }
        
        
        
    }
    
}
