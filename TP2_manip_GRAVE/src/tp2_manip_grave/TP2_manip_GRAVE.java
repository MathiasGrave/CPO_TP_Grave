/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_grave;

/**
 *
 * @author Grave
 */
public class TP2_manip_GRAVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3=assiette2;
        //Seule deux assiettes de tartiflette ont été créées. assiette2 et assiette3 référence le même objet.
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        assiette2.nbCalories+=10;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        //Lorsque l'on augmente la valeur nbCalories de assiette2, celle de assiette3 augmente aussi. Donc elles référence le même objet
        //Ces lignes sont incorrectes car une référence d'une classe, ne peut pas être référencé un objet d'une autre classe.
        Moussaka Tab[];
        Tab = new Moussaka[10];
        for (int j=0; j<=9; j++) {
            Tab[j] = new Moussaka(400);
            
        }
        

    }
    
}
