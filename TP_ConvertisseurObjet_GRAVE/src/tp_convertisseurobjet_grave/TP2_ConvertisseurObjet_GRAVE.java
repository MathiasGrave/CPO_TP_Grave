/*
 * Mathias Grave
 * TP2
 * convertisseur
 */
package tp_convertisseurobjet_grave;

import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class TP2_ConvertisseurObjet_GRAVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur UneConversion = new Convertisseur(); //Création d'un premier objet de type Convertisseur
        double tempK=300;
        double tempF = UneConversion.KelvinVersFarenheit(tempK); 
        double tempC = UneConversion.KelvinVersCelcius(tempK);
        double tempC2 = UneConversion.FarenheitVersCelcius(tempF);
        //Utilisation des méthode de l'objet créé pour effectuer des conversions
        System.out.println(tempC);
        System.out.println(tempC2);
        Convertisseur DeuxiemeConversion = new Convertisseur(); // Création d'un deuxième objet de type Convitisseur
        tempC=40;
        tempF = DeuxiemeConversion.CelciusVersFarenheit(tempC);
        tempK = DeuxiemeConversion.CelciusVersKelvin(tempC);
        double tempK2 = DeuxiemeConversion.FarenheitVersKelvin(tempF);
        //Utilisation des méthode de l'objet 2 pour effectuer des conversion
        System.out.println(tempK);     
        System.out.println(tempK2);
        System.out.println(UneConversion);
        System.out.println(DeuxiemeConversion);
        
        double temp;
        System.out.println("Bonjour, saisissez une valeur :");
        Scanner sc=new Scanner(System.in);
        temp=sc.nextDouble();        
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n1) De Celcius vers Kelvin"+"\n2) De Kelvin vers Celcius"+"\n3) De Farenheit vers Celcius"+"\n4) De Celcius vers Farenheit"+"\n5) De Kelvin vers Farenheit"+"\n6) De Farenheit vers Kelvin");
        Scanner var=new Scanner(System.in);
        //Demande de la conversion à effectuer
        int conv;
        conv=var.nextInt();
        double tfinale;
        if (conv==1) {
            tfinale=UneConversion.CelciusVersKelvin(temp);
            System.out.println(temp+" degrés Celsius est égal à "+tfinale+" Kelvin");
        }
        else if (conv==2) {
            tfinale=UneConversion.KelvinVersCelcius(temp);
            System.out.println(temp+" Kelvin est égal à "+tfinale+" degrés ");    
        }
        else if (conv==3){
            tfinale=UneConversion.FarenheitVersCelcius(temp);
            System.out.println(temp+" degrés Farenheit est égal à "+tfinale+" degrés Celcius");
        }
        else if (conv==4) {
            tfinale=UneConversion.CelciusVersFarenheit(temp);
            System.out.println(temp +" degrés Celcius est égal à "+tfinale+" degrés Farenheit");
        }
        else if (conv==5) {
            tfinale=UneConversion.KelvinVersFarenheit(temp);
            System.out.println(temp+" Kelvin est égal à "+tfinale+" degrés Farnheit");
        }
        else if (conv==6) {
            tfinale=UneConversion.FarenheitVersKelvin(temp);
            System.out.println(temp+" degrés Farenheit est égal à "+tfinale+" Kelvin");
        }
    }// Création d'une boucle if pour effectuer la conversion souhaité par l'utilisateur, et afficher la valeur obtenue.

}