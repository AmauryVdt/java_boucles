package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    public int taux;

    public CompteTaux( int num, int solde, int taux ) {
        super( num, solde );
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "taux=" + taux +
                "} " + super.toString();
    }
}
