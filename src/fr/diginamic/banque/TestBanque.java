package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {

        Compte compte = new Compte(5647676, 464684);
        System.out.println(compte);

        Compte[] comptesTab = {new Compte(1456456, 545646), new CompteTaux(4544,468468,468)};
        for (Compte compte1 : comptesTab) {
            System.out.println(compte1);
        }
    }
}
