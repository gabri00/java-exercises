package risolProp.datastructures;

import java.util.ArrayList;

public class Formula extends ArrayList<Clause> {

    public Formula() {
        super();
    }

    // Ridefisce il metodo add per non aggiungere tautologie e duplicati
    @Override
    public boolean add(Clause c) {
        if(c.isTautology()) return false;   // Se la clausola è una tautologia, non viene aggiunta

        // Se la formula contiene già la clausola c, allora non viene aggiunta.
        // Attenzione: per funzionare in modo corretto, il metodo contains richiede la ridefinizione del metodo equals in clause
        if(contains(c)) return false;

        // Se la clausola non è contenuta nella formula e non è una tautologia, allora può essere aggiunta
        return super.add(c);
    }
}