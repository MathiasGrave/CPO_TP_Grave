/*
 * Mathias Grave
 * TP2
 * convertisseur
 */
package tp_convertisseurobjet_grave;

/**
 *
 * @author Grave
 */
public class TP2_ConvertisseurObjet_GRAVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur UneConversion = new Convertisseur();
        double tempK=300;
        double tempF = UneConversion.KelvinVersFarenheit(tempK);
        double tempC = UneConversion.KelvinVersCelcius(tempK);
        double tempC2 = UneConversion.FarenheitVersCelcius(tempF);
        System.out.println(tempC);
        System.out.println(tempC2);
        Convertisseur DeuxiemeConversion = new Convertisseur();
        tempC=40;
        tempF = DeuxiemeConversion.CelciusVersFarenheit(tempC);
        tempK = DeuxiemeConversion.CelciusVersKelvin(tempC);
        double tempK2 = DeuxiemeConversion.FarenheitVersKelvin(tempF);
        System.out.println(tempK);     
        System.out.println(tempK2);
        System.out.println(UneConversion);
        System.out.println(DeuxiemeConversion);
    }

}