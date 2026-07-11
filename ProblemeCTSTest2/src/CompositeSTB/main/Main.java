package CompositeSTB.main;

import CompositeSTB.clase.Autobuz;
import CompositeSTB.clase.GrupAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes", "Sprinter", 10);
        Autobuz autobuz2 = new Autobuz("Ford", "Transit", 10);

        Autobuz autoMediu1 = new Autobuz("Iveco", "Daily", 30);

        Autobuz autoMare1 = new Autobuz("Volvo", "9700", 50);
        Autobuz autoMare2 = new Autobuz("MAN", "Lion's Coach", 50);

        GrupAutobuz grupMici = new GrupAutobuz("Grupuri Mici - 10 locuri");
        GrupAutobuz grupMedii = new GrupAutobuz("Grupuri Medii - 30 locuri");
        GrupAutobuz grupMari = new GrupAutobuz("Grupuri Mari - 50 locuri");

        grupMici.adaugaAutobuz(autobuz1);
        grupMici.adaugaAutobuz(autobuz2);

        grupMedii.adaugaAutobuz(autoMediu1);

        grupMari.adaugaAutobuz(autoMare2);

        GrupAutobuz flota = new GrupAutobuz("flota completa");
        flota.adaugaAutobuz(grupMici);
        flota.adaugaAutobuz(grupMedii);
        flota.adaugaAutobuz(grupMari);

        flota.afiseazaDetalii();
    }
}
