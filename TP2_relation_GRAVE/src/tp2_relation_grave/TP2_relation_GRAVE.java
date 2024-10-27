/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_grave;

/**
 *
 * @author Grave
 */
public class TP2_relation_GRAVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
        //bob.liste_voitures[0] = uneClio ;
        //bob.nbVoiture = 1 ;
        //uneClio.proprietaire = bob ;
        //System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        //bob.liste_voitures[1]=une2008;
        //bob.nbVoiture=2;
        //une2008.proprietaire = bob;
        //System.out.println("la deuxieme voiture de Bob est " +bob.liste_voitures[1] ) ;
        //reno.liste_voitures[0]= uneAutreClio;
        //reno.nbVoiture=1;
        //uneAutreClio.proprietaire=reno;
        //System.out.println("la premiere voiture de Reno est " +reno.liste_voitures[0] );
        //uneMicra.proprietaire=reno;
        //reno.liste_voitures[1]=uneMicra;
        //reno.nbVoiture=2;
        //uneMicra.proprietaire=reno;
        //System.out.println("la deuxieme voiture de Reno est " +reno.liste_voitures[1] );
        bob.ajouter_une_voiture(uneClio);
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        bob.ajouter_une_voiture(une2008);
        System.out.println("la deuxieme voiture de Bob est " +bob.liste_voitures[1] ) ;
        reno.ajouter_une_voiture(uneAutreClio);
        System.out.println("la premiere voiture de Reno est " +reno.liste_voitures[0] ) ;
        reno.ajouter_une_voiture(uneMicra);
        System.out.println("la deuxieme voiture de Reno est " +reno.liste_voitures[1] ) ;
    }           
}
