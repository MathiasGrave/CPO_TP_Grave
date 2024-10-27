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
    String nom; //Création de la variable nom, de type String, de la classe Personne
    String prenom;//Création de la variable prénom, de type String, de la classe Personne
    int nbVoiture; //Création de la variable nbVoiture, de typ int, de la classe Personne
    Voiture [] liste_voitures; //Création de la variable liste_voitures, un tableau d'éléments de type Voiture, de la classe Personne
    public Personne(String UnNom, String UnPrenom){ //Création du constructeur
        UnNom=nom;
        UnPrenom=prenom;
        liste_voitures = new Voiture [3];
        nbVoiture=0;
    }

    @Override
    public String toString() { // Création de la méthode toString()
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    public boolean ajouter_une_voiture(Voiture voiture_a_ajouter) { //Création de la méthode ajouter_une_voiture, qui prend en argument un élément de type Voiture et qui renvoit un booléen
        boolean voiture_ajoutee; 
        if ((voiture_a_ajouter.proprietaire!=null)&&(nbVoiture>=3)) { // Si la voiture a déjà un propriétaire ou si le propriétaire a déjà 3 voiture, alors
            voiture_ajoutee=false; //le booléen à rtourner est faux
        }
        else { //Si le propriétaire possède moins de 3 voitures, et que la voiture n'appartient à personne alors
            liste_voitures[nbVoiture]=voiture_a_ajouter; //La voiture est ajoutée à la personne
            nbVoiture++; //Le nombre de voiture de la personne augmente de 1
            voiture_a_ajouter.proprietaire=this; //le propriétaire de la voiture devient la personne
            voiture_ajoutee=true; //Le booléen à retourner est vrai
        }
        return voiture_ajoutee;//On retourne le booléen
    }   
    
}
