package fr.diginamic.banque.entites;

import java.util.Date;

public abstract class Operation {

    protected Date date;

    protected int montant;

    protected Operation (Date date, int montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String afficherType();

    public abstract int operation();

    @Override
    public String toString() {
        return "Operation{" +
                "date=" + date +
                ", montant=" + montant +
                '}';
    }
}
