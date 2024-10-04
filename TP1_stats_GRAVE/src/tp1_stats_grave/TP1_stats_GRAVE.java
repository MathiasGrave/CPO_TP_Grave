/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * TP1
 * Mathias Grave
 * Exercice 4
*/
package tp1_stats_grave;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP1_stats_GRAVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int De[] = new int[6];
        System.out.println("Entrez un entier positif");
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        for (int i=0; i<m; i++) {
            Random random = new Random();
            int face = random.nextInt((7 - 1) + 1) + 1;
            if (face==1){
                De[0]+=1;
            }
            else if (face==2) {   
                De[1]+=1;
            }
            else if (face==3) {
                De[2]+=1;
            }
            else if (face==4) {
                De[3]+=1;
            }
            else if (face==5) {
                De[4]+=1;
            }
            else {
                De[5]+=1;
        }
}
        double P_Face[]=new double[6];
        for (int i=0; i<6; i++) {
            System.out.println("La face "+i+" est apparue "+De[i]+" fois");
        }
        for (int j=0; j<6; j++) {
            P_Face[j]= De[j]*100/m;
            System.out.println("Le pourcentage d'apparition de la face "+j+" est : "+P_Face[j]);
        }
        
    }    
}
