package ProxySTB.main;

import ProxySTB.clase.Autobuz;
import ProxySTB.clase.AutobuzNoapte;
import ProxySTB.clase.MijlocDeTransport;
import ProxySTB.clase.Statie;

public class main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz226 = new Autobuz(3, 226);
        MijlocDeTransport autobuz109 = new Autobuz(0, 109);

        Statie statie1 = new Statie("Romana", 10);
        Statie statie2 = new Statie("Universitate", 0);
        autobuz226.opresteInStatie(statie1);
        autobuz109.opresteInStatie(statie2);

        MijlocDeTransport autobuz = new AutobuzNoapte(autobuz109);
        MijlocDeTransport autobuz2 = new AutobuzNoapte(autobuz226);
        autobuz.opresteInStatie(statie2);
        autobuz2.opresteInStatie(statie1);

    }
}
