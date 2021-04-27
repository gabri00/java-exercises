package risolProp.core;

import risolProp.datastructures.Formula;
import risolProp.input.Dimacs;

public class Main {

    public static void main(String[] args) {

        // Si crea una formula vuota perché le clausole verranno aggiunte durante l'esecuzione del metodo parse (class Dimacs)
        Formula formula = new Formula();
        Dimacs d = new Dimacs();

        // Lettura del file
        if(!d.parse("test1.SAT.dimacs", formula)) {
            System.err.println("Errore durante la lettura del file.");
            return;
        }

        System.out.println(formula);

        // Controlla se la formula è soddisfacibile usando il metodo di risoluzione
        Resolution r = new Resolution();
        if(r.isSat(formula))
            System.out.println("La formula è soddisfacibile.");
        else
            System.out.println("La formula è insoddisfacibile.");
    }

}
