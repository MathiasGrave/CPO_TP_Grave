/*
 * TP1
 * Exercice 3
 * Mathias Grave
 */
package tp1_guessmynumber_grave;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP1_guessMyNumber_Grave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        //Initialisation et attribut d'une valeur aléatoire entières entre 1 et 100 à une variable n
        int nb;
        nb=0;
        //Initialisation et demande de la valeur à l'utilisateur de la variable nb
        int compte = 1;
        System.out.println("Choississez un mode de diffuculté : \n1) Facile \n2) Moyen \n3) Difficile");
        int choix;
        Scanner vari=new Scanner(System.in);
        choix=vari.nextInt();
        if (choix==1) {
            System.out.println("Vous avez choisi le mode facile : Le programme vous indiquera si l'écart entre le nombre à deviner et le vôtre est suppérieur à 25");
            while (nb!=n) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez un nombre entre 1 et 100");
                nb=sc.nextInt();
                if (nb>n) {
                    if (nb-n>25) {
                        System.out.println("Vraiment trop grand");
                    }
                    else {
                    System.out.println("trop grand");
                    }
            }
                else if (nb<n) {
                    if (n-nb>25){
                        System.out.println("Vraiment trop petit");
                    }
                    else {
                        System.out.println("Trop petit");
                    }
            }
            
            compte+=1;
            }
        }
        else if (choix==2) {
         System.out.println("Vous avez choisi le mode moyen");
            while (nb!=n) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez un nombre entre 1 et 100");
                nb=sc.nextInt();
                if (nb>n) {
                    System.out.println("trop grand");
                }   
            
                else  {
                        System.out.println("Trop petit");
                    }
            compte+=1;
            }
            }
        else if (choix==3) {
         System.out.println("Vous avez choisi le mode difficile, vous avez 10 coups pour trouver le nombre");
            while ((nb!=n)&&(compte<5)) {
                Scanner sc = new Scanner(System.in);
            System.out.println("Entrez un nombre entre 1 et 100");
            nb=sc.nextInt();
                if (nb>n) {
                    System.out.println("trop grand");
                }   
                else  {
                        System.out.println("Trop petit");
                    }
            
            compte+=1;
            }
            if ((nb!=n)&&(compte>=53)) {
                System.out.println("Vous n'avez pas trouver le bon nombre en 5 coups, la réponse est : "+n);
            }
        }
        if (n==nb) {
            compte-=1;
            System.out.println("Gagné ! Vous avez réussi en "+compte+" tentative(s)"); 
        }
    }
    }
