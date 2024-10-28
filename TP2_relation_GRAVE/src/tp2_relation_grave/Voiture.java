package tp2_relation_grave;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Grave
 */
public class Voiture {// Création de la classe Voiture
    String marque; // Création de l'attribut marque, de type String, de la classe Voiture
    String modele; //Création de l'attribut modele, de type String, de la classe Voiture
    int PuissanceCV; //Création de l'attribut PuissanceCV ,de type int, de la classe Voiture
    Personne proprietaire;
    public Voiture(String UnModele, String UneMarque, int UnePuissance) { // Création du constructeur
        modele=UnModele;
        marque=UneMarque;
        PuissanceCV=UnePuissance;
        proprietaire=null;
    }

    @Override
    public String toString() { //Création de la méthode toString()
        return "Voiture{" + "marque=" + marque + ", modele=" + modele + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
    
    
}
