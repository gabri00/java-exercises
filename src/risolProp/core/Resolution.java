package risolProp.core;

import risolProp.datastructures.Clause;
import risolProp.datastructures.Formula;

public class Resolution {

    public boolean isSat(Formula formula) {
        /*
         * Per ogni coppia di clausole c1 e c2, cerchiamo di fare risoluzione
         * tra c1 e c2.
         *
         * Se la clausola risultante c3 è vuota, allora l'algoritmo si ferma
         * perché la formula è insoddisfacibile.
         *
         * Se c3 non è vuota, viene aggiunta alla formula e l'algoritmo continua
         * fino a quando tutte le clausole non sono state provate.
         *
         */

        for (int i = 0; i < formula.size(); i++) {
            Clause c1 = formula.get(i);

            for (int j = 0; j < formula.size(); j++) {
                Clause c2 = formula.get(j);

                // Cerco un letterale tra c1 e c2 su cui fare la risoluzione, se non esiste lit sarà null
                Integer lit = c1.findLiteralForResolution(c2);
                if (lit != null) {
                    Clause c3 = new Clause();
                    // Risoluzione tra c1 e c2 tramite lit, crea c3
                    c3.merge(c1, c2, lit);

                    System.out.println("Ho fatto risoluzione tra " + c1 + " e " + c2 + " usando " + lit + " ottenendo la clausola" + c3);

                    if (c3.isEmpty()) return false;

                    formula.add(c3);
                }
            }
        }

        return true;
    }
}
