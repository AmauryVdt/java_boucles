package fr.diginamic.banque.entites;

import java.util.Date;

public class Debit extends Operation {

    public Debit(Date date, int montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Debit";
    }

    @Override
    public int operation() {
        return -montant;
    }
}
