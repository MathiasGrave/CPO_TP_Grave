/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Grave
 */
public class Magicien extends Personnage{
    private boolean Confirme;

    public Magicien(String nom, int niveauDeVie, boolean Confirme) {
        super(nom, niveauDeVie);
        this.Confirme = Confirme;
    }

    public boolean setConfirme() {
        return Confirme;
    }
    
    
}
