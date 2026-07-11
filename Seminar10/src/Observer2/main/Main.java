package Observer2.main;

import Observer2.clase.Autobuz;
import Observer2.clase.Calator;
import Observer2.clase.CalatorAbonat;
import Observer2.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Calator calator = new CalatorAbonat("Mihaita");
        Calator calator1 = new CalatorAbonat("Gigel");
        Calator calator2 = new CalatorAbonat("Costel");
        Calator calator3 = new CalatorAbonat("Adita");

        MijlocTransport autobuz = new Autobuz("168");

        autobuz.abonare(calator);
        autobuz.abonare(calator1);
        autobuz.abonare(calator2);

        autobuz.pleacaDinDepou();
        autobuz.abonare(calator3);
        autobuz.blocatInTrafic();
    }
}
