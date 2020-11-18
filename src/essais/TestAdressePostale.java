package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestAdressePostale {

    public static void main(String[] args) {

        AdressePostale adressePostale1 = new AdressePostale(16, "Fuit", 44115, "Baase Goulaine");
        AdressePostale adressePostale2 = new AdressePostale(10, "Fuit", 44115, "Baase Goulaine");

        Personne personne1 = new Personne("VANDEMOORTELE", "Amaury", adressePostale1);
        Personne personne2 = new Personne("PIVETEAU", "Nicolas", adressePostale2);
    }
}
