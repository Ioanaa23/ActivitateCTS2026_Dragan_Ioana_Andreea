package ro.ase.cts.classes.readers;

import ro.ase.cts.classes.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        return null;
    }

    protected void readAplicant(Scanner input, Aplicant outAplicant){
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        outAplicant.setNume(nume);
        outAplicant.setPrenume(prenume);
        outAplicant.setPunctaj(punctaj);
        outAplicant.setVarsta(varsta);
        outAplicant.setNr_proiecte(nr);
    }
}
