/*
 * TP1
 * Exercice 1
 * Mathias Grave
 */
package tp1_exercice1_grave;

import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP1_ManipNombresInt_Grave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        //On initialise la variable 1
        int nb2;
        //On initialise la variable 2
        Scanner sc= new Scanner(System.in);
        System.out.println("Entrez un premier nombre :");
        nb1=sc.nextInt();
        Scanner nb=new Scanner(System.in);
        System.out.println("Entrez un deuxieme nombre :");
        nb2=nb.nextInt();
        //On demande à l'utilisateur d'entrer les valeurs de ces variables.
        int somme;
        int produit;
        int difference;
        //On initialise Les variables qui vont stocker les différentes opérations demandés
        difference=nb1-nb2;
        produit=nb1*nb2;
        somme=nb1+nb2;
        System.out.println("La somme de ces 2 nombre est : "+somme+" ; leur difference est : "+difference+" ; et leur produit est : "+produit);
        //On affiche les résultats des différentes opérations
        int quotient;
        int reste;
        quotient=nb1/nb2;
        reste=nb1%nb2;
        System.out.println("Leur quotient entier est : "+quotient+" ; et le reste est : "+reste);
        //On réitère pour le quotient entier et le reste de la division euclidienne
    }
    
}
