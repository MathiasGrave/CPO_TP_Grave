/*
 * Mathias Grave
 * TP1 
 * Exrecice 1
*/
package tp2_bieres_grave;

/**
 *
 * @author Grave
 */
public class TP2_Bieres_Grave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        secondeBiere.lireEtiquette();
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chouffe", 8.0, "Achouffe");
        troisiemeBiere.lireEtiquette();
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Triple Karmelite", 8.4, "Bosteels");
        quatriemeBiere.lireEtiquette();
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Hoegaarden", 4.9, "Hoegaarden");
        cinquiemeBiere.lireEtiquette();
        boolean ouverture=cinquiemeBiere.Decapsuler();
        if (ouverture==true) {
            System.out.println("La biere est ouverte !");
        }
        System.out.println(uneBiere);
        System.out.println(secondeBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(cinquiemeBiere);
    }
    
    
}
