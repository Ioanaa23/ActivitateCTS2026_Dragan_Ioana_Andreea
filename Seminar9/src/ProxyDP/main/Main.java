package ProxyDP.main;

import ProxyDP.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz(23, 168);
        MijlocDeTransport autobuz1 = new Autobuz(0, 226);

        Statie statie = new Statie("Piata Romana", 10);
        Statie statie1 = new Statie("Universitate", 0);

        autobuz.opresteInStatie(statie);
        autobuz1.opresteInStatie(statie1);

        MijlocDeTransport autobuzNoapte168 = new AutobuzNoapte(autobuz);
        MijlocDeTransport autobuzNoapte226 = new AutobuzNoapte(autobuz1);

        autobuzNoapte168.opresteInStatie(statie);
        autobuzNoapte226.opresteInStatie(statie1);

        System.out.println("--------------------\n");

        MijlocDeTransport autobuzSpecial = new Autobuz(12, 6, TipCursa.CURSA_SPECIALA);
        MijlocDeTransport autobuzSepcialCursa = new AutobuzCursaSpeciala(autobuzSpecial);
        MijlocDeTransport autobuzSpecial168 = new AutobuzCursaSpeciala(autobuz);

        autobuzSepcialCursa.opresteInStatie(statie);
        autobuzSpecial168.opresteInStatie(statie);

    }
}
