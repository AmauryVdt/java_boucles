package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.sql.Date;

public class TestOperation {

    public static void main(String[] args) {

        Operation[] operationsTab = {
                new Credit(new Date(120, 1, 1), 999),
                new Credit(new Date(120, 1, 1), 888),
                new Debit(new Date(120, 1, 1), 555),
                new Debit(new Date(120, 1, 1), 444)
        };

        for (Operation operation : operationsTab) {
            System.out.println(operation.afficherType() + " : " + operation);
        }

        int somme = 0;
        for (Operation operation : operationsTab) {
            somme += operation.operation();
        }
        System.out.println("Somme = " + somme);
    }
}
