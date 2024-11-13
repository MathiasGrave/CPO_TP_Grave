/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_grave;

/**
 *
 * @author Grave
 */
public class Guerrier extends Personnage{
    private boolean ACheval;

    public Guerrier(boolean ACheval, String nom, int niveauDeVie) {
        super(nom, niveauDeVie);
        this.ACheval = ACheval;
    }

    public void setACheval(boolean ACheval) {
        this.ACheval = ACheval;
    }
    
}
