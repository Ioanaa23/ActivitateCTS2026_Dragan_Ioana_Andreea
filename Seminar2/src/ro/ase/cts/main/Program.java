package ro.ase.cts.main;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.readers.AngajatiReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		Angajat.setValoareFinantareAngajat(50);

		List<Aplicant> listaAngajati;
		try {
			AngajatiReader angajatReader = new AngajatiReader("angajati.txt");
			listaAngajati = angajatReader.readAplicanti();

			for(Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afiseazaFinantare();
				angajat.afiseazaStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
