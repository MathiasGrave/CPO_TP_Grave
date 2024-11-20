/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Grave
 */
public class Epee extends Arme{
    int indiceDeFinesse;
    public Epee(String UnNom, int unNiveauAttaque, int unIndiceDeFinesse) {
        super(UnNom, unNiveauAttaque);
        indiceDeFinesse=unIndiceDeFinesse;
        if (unIndiceDeFinesse>=100) {
           unIndiceDeFinesse=100;
        }
        else if (unIndiceDeFinesse<0) {
            unIndiceDeFinesse=0;
        }
        
    }

    @Override
    public String toString() {
        return "Epee{" + "indiceDeFinesse=" + indiceDeFinesse + '}';
    }
  
}
