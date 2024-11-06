/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_grave;

/**
 *
 * @author Grave
 */
public abstract class Arme {
    private String nom;
    private int niveauAttaque;
    public  Arme(String UnNom, int unNiveauAttaque) {
        UnNom=nom;
        unNiveauAttaque=niveauAttaque;         
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