/*
 * TP0
 * Exercice 2
 * Mathias Grave
 */
package tp0_exercie2;

import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP0_Exercie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
int nb;

//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier// nombre dentiers a additionner
int result; // resultat
int ind; //indice

result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind+=1;
        
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + " entiers est: "+result);
    }
    
}
