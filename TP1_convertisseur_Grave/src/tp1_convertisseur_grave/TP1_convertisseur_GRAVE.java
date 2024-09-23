/*
 * TP1
 * Exercice 2
 * Mathias Grave
 */
package tp1_convertisseur_grave;

import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP1_convertisseur_GRAVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp;
        System.out.println("Bonjour, saisissez une valeur :");
        Scanner sc=new Scanner(System.in);
        temp=sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n1) De Celcius vers Kelvin"+"\n2) De Kelvin vers Celcius"+"\n3) De Farenheit vers Celcius"+"\n4) De Celcius vers Farenheit"+"\n5) De Kelvin vers Farenheit"+"\n6) De Farenheit vers Kelvin");
        Scanner var=new Scanner(System.in);
        int conv;
        conv=var.nextInt();
        double tCelcius;
        double tKelvin;
        double tFarenheit;
        if (conv==1) {
            tKelvin=CelciusVersKelvin(temp);
            System.out.println(temp+" degrés Celsius est égal à "+tKelvin+" degrés ");
        }
        else if (conv==2) {
            tCelcius=KelvinversCelcius(temp);
            
        }

    }
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin;
        tKelvin=tCelcius+273.15;
        return tKelvin;
    }
    public static double KelvinversCelcius (double tKelvin) {
        double tCelcius;
        tCelcius=tKelvin-273.15;
        return tCelcius;
    }
    public static double FarenheitversCelcius (double tFarenheit) {
        double tCelcius;
        tCelcius=(tFarenheit-32)*1.8;
        return tCelcius;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit;
        tFarenheit=tCelcius/1.8+32;
        return tFarenheit;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        double tCelcius=KelvinversCelcius(tKelvin);
        double tFarenheit=CelciusVersFarenheit(tCelcius);
        return tFarenheit;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tCelcius=FarenheitversCelcius(tFarenheit);
        double tKelvin=CelciusVersKelvin(tCelcius);
        return tKelvin;
    }
}

