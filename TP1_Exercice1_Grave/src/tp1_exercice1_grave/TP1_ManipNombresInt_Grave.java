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
        int nb2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Entrez un premier nombre :");
        nb1=sc.nextInt();
        Scanner nb=new Scanner(System.in);
        System.out.println("Entrez un deuxieme nombre :");
        nb2=nb.nextInt();
        System.out.println("Le premier nombre est "+nb1+" et le deuxieme nombre est "+nb2);
        int somme;
        int produit;
        int difference;
        difference=nb1-nb2;
        produit=nb1*nb2;
        somme=nb1+nb2;
        System.out.println("La somme de ces 2 nombre est : "+somme+" ; leur difference est : "+difference+" ; et leur produit est : "+produit);
        int quotient;
        int reste;
        quotient=nb1/nb2;
        reste=nb1%nb2;
        System.out.println("Leur quotient entier est : "+quotient+" ; et le reste est : "+reste);
        
    }
    
}
