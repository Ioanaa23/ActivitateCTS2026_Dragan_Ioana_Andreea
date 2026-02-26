package ro.ase.cts.main;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.readers.AngajatiReader;
import ro.ase.cts.classes.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AngajatiReader angajatReader = new AngajatiReader();
			listaAngajati = angajatReader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
