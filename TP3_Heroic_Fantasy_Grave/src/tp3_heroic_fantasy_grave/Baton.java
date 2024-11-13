/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_grave;

/**
 *
 * @author Grave
 */
public class Baton extends Arme {
    private int age;
    public Baton(String UnNom, int unNiveauAttaque, int unAge) {
        super(UnNom, unNiveauAttaque);
        age=unAge;
        if (unAge>=100) {
            unAge=100;
        }
        else if (unAge<0) {
            unAge=0;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age<100)&&(age>=0)) {
        this.age = age;
    }
    }    

}