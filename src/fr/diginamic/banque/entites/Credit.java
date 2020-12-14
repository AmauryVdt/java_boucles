package fr.diginamic.banque.entites;

import java.util.Date;

public class Credit extends Operation {

    public Credit(Date date, int montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Credit";
    }

    @Override
    public int operation() {
        return montant;
    }
}
