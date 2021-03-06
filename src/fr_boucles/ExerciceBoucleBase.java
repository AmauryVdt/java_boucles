package fr_boucles;

public class ExerciceBoucleBase {

    public static void main(String[] args) {

        //Affichez tous les nombres de 1 à 10
        for (int i = 1; i <= 10; i++) {
            System.out.println( i );
        }

        //Affichez 20 fois votre nom et votre prénom
        String fname = "Amaury";
        String lname = "VANDEMOORTELE";

        for (int i = 0; i < 20; i++) {
            System.out.println(i+1 + " : " + fname + " " + lname);
        }

        //Affichez les éléments pairs de 2 à 100
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }

        //Affichez les éléments impairs de 1 à 99
        for (int i = 1; i <= 99; i+=2) {
            System.out.println(i);
        }
    }
}
