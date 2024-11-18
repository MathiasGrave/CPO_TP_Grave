/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
/**
 *
 * @author Grave
 */
public abstract class  Personnage { // Créeation de la classe et de ses attibuts
    private String nom;
    private int niveauDeVie;
    public Personnage(String nom, int niveauDeVie) { //Création du constructeur
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }
    ArrayList Liste_Armes; //Création de la liste dynamique d'armes que le personnages peut posséder
    

    public void ajout_Arme(Arme nouvelleArme) {
        if (Liste_Armes==null){
            Liste_Armes.add(nouvelleArme);
        }
        else if (Liste_Armes.size()<5){
            Liste_Armes.add(nouvelleArme);
        }
    }

    Arme Arme_en_main=null; // Création de la variable contenant l'arme de prédilection du personnage.

    public Arme getArme_en_main() {
        return Arme_en_main;
    }
    
    public Arme Porter_une_arme(Arme Arme_a_porter){
        for (int i=0;i<Liste_Armes.size(); i++){
            if (Arme_a_porter==Liste_Armes.get(i)){
                Arme_en_main=Arme_a_porter;
                System.out.println(Arme_a_porter + " a bien été ajoutée comme arme de prédilection");
            }
            else {
                System.out.println(Arme_a_porter + " n'est pas dans votre liste d'armes");
            }
        }
        return Arme_en_main;
    }
    
    
    @Override
    public String toString() {
        if (Arme_en_main!=null){
        return "Personnage{" + "nom=" + nom + ", niveauDeVie=" + niveauDeVie + "arme de prédilection : "+Arme_en_main +'}';
        }
        else {
            return "Personnage{" + "nom=" + nom + ", niveauDeVie=" + niveauDeVie + "}";
        }
    }
    
    public int longueur(){
        int longueur = Liste_Armes.size();
        return longueur;
    }
    
    
    
}
