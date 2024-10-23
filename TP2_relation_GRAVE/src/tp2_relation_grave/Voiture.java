package tp2_relation_grave;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Grave
 */
public class Voiture {
    String marque;
    String modele;
    int PuissanceCV;
    Personne proprietaire;
    public Voiture(String UnModele, String UneMarque, int UnePuissance) {
        modele=UnModele;
        marque=UneMarque;
        PuissanceCV=UnePuissance;
        proprietaire=null;
    }

    @Override
    public String toString() {
        return "Voiture{" + "marque=" + marque + ", modele=" + modele + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
    
    
}
