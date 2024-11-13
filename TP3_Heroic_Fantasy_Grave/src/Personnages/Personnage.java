/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
/**
 *
 * @author Grave
 */
public abstract class  Personnage {
    private String nom;
    private int niveauDeVie;
    public Personnage(String nom, int niveauDeVie) {
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
    Arme ArrayList;

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveauDeVie=" + niveauDeVie + '}';
    }
    

    
    
}
