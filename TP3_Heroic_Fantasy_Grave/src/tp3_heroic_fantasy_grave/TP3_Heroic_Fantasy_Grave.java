/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_grave;

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
        
    }
    
}
