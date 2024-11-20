/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Grave
 */
public class Guerrier extends Personnage{
    private boolean ACheval;

    public Guerrier( String nom, int niveauDeVie, boolean ACheval) {
        super(nom, niveauDeVie);
        this.ACheval = ACheval;
    }
    static int compteurGuerrier;
    public static int compteur(){
        compteurGuerrier++;
        return compteurGuerrier;
    }

    public void setACheval(boolean ACheval) {
        this.ACheval = ACheval;
    }
    
}
