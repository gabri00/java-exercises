package risolProp.input;

import risolProp.datastructures.Clause;
import risolProp.datastructures.Formula;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dimacs {

    public Dimacs() {
    }

    public boolean parse(String filename, Formula formula) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filename));
            while(br.ready()) {
                String line = br.readLine();

                // Salta i commenti e la linea contenente p cnf
                if(line.startsWith("c") || line.startsWith("p cnf"))    continue;

                // Crea una clausola
                Clause c = createClause(line);
                if(c != null)   formula.add(c);
                else            return false;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Attenzione: il file non esiste.");
            return false;
        } catch (IOException e) {
            System.err.println("Attenzione: errore durante la lettura del file.");
            return false;
        }
        finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.err.println("Attenzione: errore durante la chiusura del file.");
                return false;
            }
        }

        return true;
    }

    private Clause createClause(String line) {
        // A partire dalla stringa "1 2 -3 0", crea un array di stringhe ["1","2","-3","0"], quindi:
        //      newLine[0] = "1"
        //      newLine[1] = "2"
        //      newLine[2] = "-3"
        //      newLine[4] = "0"

        String[] newLine = line.split(" ");
        Clause c = new Clause();

        // Itera sugli elementi dell'array, escluso lo 0 (che è l'ultimo elemento)
        for(int i = 0; i < newLine.length - 1; i++) {
            String litString = newLine[i];
            try {
                // Converte la stringa in intero
                Integer litInteger = Integer.parseInt(litString);
                c.addLiteral(litInteger);
            } catch(NumberFormatException e) {
                // Se non è possibile convertire la stringa in intero termina
                System.err.println("Attenzione: mi aspettavo di leggere un numero.");
                return null;
            }
        }

        return c;
    }

}
