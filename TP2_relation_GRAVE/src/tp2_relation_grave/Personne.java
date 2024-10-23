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
    public Personne(String UnNom, String UnPrenom){
        UnNom=nom;
        UnPrenom=prenom;  
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
    
}
