package risolProp.datastructures;

import java.util.HashSet;
import java.util.Set;

public class Clause {

    private Set<Integer> literals;

    public Clause() {
        literals = new HashSet<Integer>();
    }

    // Adds a literal to the clause
    public void addLiteral(Integer lit) {
        literals.add(lit);
    }

    // Se la clausola è vuota => non è soddisfacibile
    public boolean isEmpty() {
        return literals.isEmpty();
    }

    // Una clausola è tautologica se contiene un letterale e la sua negazione
    // Esempio: x1 U x2 U x3 U -x1 è tautologica perché contiene sia x1 che -x1
    public boolean isTautology() {
        for(Integer lit : literals) {
            if(literals.contains(-lit)) return true;
        }
        return false;
    }

    // Cerca un letterale su cui fare la risoluzione
    public Integer findLiteralForResolution(Clause c) {
        for(Integer lit : literals) {
            if(c.literals.contains(-lit))
                return lit;
        }
        return null;
    }

    // Unisce le due clausole c1 e c2 sul letterale lit
    public void merge(Clause c1, Clause c2, Integer lit) {
        literals.addAll(c1.literals);
        literals.addAll(c2.literals);
        literals.remove(lit);
        literals.remove(-lit);
    }

    @Override
    public String toString() {
        String output = "";
        output += "(";

        int count = 0;
        for(Integer lit : literals) {
            if(lit > 0) output += "x" + lit;
            else        output += "-x" + (-lit);

            // Controllo per evitare di stampare U alla fine della clausola
            if(++count != literals.size())
                output += " U ";
        }

        output += ")";
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Clause) {
            Clause c = (Clause) o;
            return literals.equals(c.literals);
        }
        return false;
    }

}

