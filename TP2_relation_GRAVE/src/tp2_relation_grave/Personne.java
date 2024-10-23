/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_grave;

/**
 *
 * @author Grave
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoiture;
    Voiture [] liste_Voitures;
    public Personne(String UnNom, String UnPrenom){
        UnNom=nom;
        UnPrenom=prenom;
        liste_Voitures = new Voiture [3];
        nbVoiture=0;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    
}
