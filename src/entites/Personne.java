package entites;

import entites.AdressePostale;

public class Personne {

    String nom;
    String prenom;
    AdressePostale adressePostal;

    public Personne (String nom, String prenom, AdressePostale adressePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostal = adressePostal;
    }
}
