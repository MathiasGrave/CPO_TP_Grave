/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_grave;

/**
 *
 * @author Grave
 */
public class Magicien extends Personnage{
    private boolean Confirme;

    public Magicien(boolean Confirme, String nom, int niveauDeVie) {
        super(nom, niveauDeVie);
        this.Confirme = Confirme;
    }

    public boolean setConfirme() {
        return Confirme;
    }
    
    
}
