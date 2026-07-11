package ProxySTB2.clase;

import ProxySTB2.clase.MijlocDeTransport;

public class Autobuz implements MijlocDeTransport {
    private int linie;

    public Autobuz(int linie) {
        this.linie = linie;
    }

    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul de pe linia " + linie + " a oprit in statia "+ statie);
    }

    @Override
    public void retrageLaAutobaza() {
        System.out.println("Autobuzul de pe linia " + linie + " se retrage la autobaza");
    }
}
