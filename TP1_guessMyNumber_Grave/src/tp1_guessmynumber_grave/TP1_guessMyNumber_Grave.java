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
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 1 et 100");
        nb=sc.nextInt();
        //Initialisation et demande de la valeur à l'utilisateur de la variable nb
        int compte = 1;
        System.out.println("Choississez un mod de diffuculté : \n1) Facile \n2) Moyen \n3) Difficile");
        int choix;
        Scanner vari=new Scanner(System.in);
        choix=vari.nextInt();
        if (choix==1) {
            System.out.println("Vous avez choisi le mode facile : Le programme vous indiquera si l'écart entre le nombre à deviner et le vôtre est suppérieur à 25");
            while (nb!=n) {
                if (nb>n) {
                    if (nb-n>50) {
                        System.out.println("Vraiment trop grand");
                    }
                    else {
                    System.out.println("trop grand");
                    }
            }
                else if (nb<n) {
                    if (n-nb>50){
                    System.out.println("trop petit");
                    }
            }
            Scanner var = new Scanner(System.in);
            nb=var.nextInt();
            compte+=1;
            }
        }
        System.out.println("Gagné ! Vous avez réussi en "+compte+" tentative(s)");
    }
    }
