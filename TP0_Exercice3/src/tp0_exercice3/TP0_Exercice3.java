/*
 *Partie 3 
 *Mathias Grave
 *Septembre 2024
 */
package tp0_exercice3;

import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP0_Exercice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the operator :");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        operator=sc.nextInt();
        
        if ((operator<0)||(operator>5)) {
            System.out.println("L'opérateur choisi n'est pas valide");
    }
        int operande1;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Entrez la première valeur :");
        operande1=sc1.nextInt();
        
        int operande2;
        Scanner sc2=new Scanner(System.in);
        System.out.println("Entrez la deuxième valeur :");
        operande2=sc2.nextInt();
        int resultat;
        if (operator==1) {
            resultat=operande1+operande2;
            System.out.println("Le résultat est : "+ resultat);
        }
        else if (operator==2) {
            resultat=operande1-operande2;
            System.out.println("Le résultat est : "+resultat);
        }
        else if (operator==3) {
            resultat=operande1*operande2;
            System.out.println("Le résultat est : "+resultat);
        }
        else if (operator==4) {
            resultat=operande1/operande2;
            System.out.println("Le résultat est : "+resultat);
        }
        else if (operator==5) {
            resultat=operande1%operande2;
            System.out.println("Le résultat est : "+resultat);
        }
        else {
            System.out.println("L'opérateur choisi n'est pas valide");
        }
    }
    
}
