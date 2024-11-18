/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Grave
 */
public abstract class Arme { //Création de la classe et de ses attributs
    private String nom;
    private int niveauAttaque;
    public  Arme(String UnNom, int unNiveauAttaque) { //Création du constructeur et de la méthode vérifiant que le niveau d'attaque est inférieur à 100
        nom=UnNom;
        niveauAttaque=unNiveauAttaque;
        if (unNiveauAttaque>100){
            unNiveauAttaque=100;
        }
        else if (unNiveauAttaque<0) {
            unNiveauAttaque=0;
        }
    }
    
    public String getNom() { 
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public void setNiveauAttaque(int niveauAttaque) { 
        if (niveauAttaque<=100) {
            this.niveauAttaque = niveauAttaque;
        }
    }

    @Override
    public String toString() {
        return "Arme{nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
    
    
    
}
