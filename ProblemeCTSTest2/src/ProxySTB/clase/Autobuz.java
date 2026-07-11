package ProxySTB.clase;

public class Autobuz implements MijlocDeTransport{
    private int nrPasageri;
    private int nrLinie;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linia " + nrLinie + " opreste in statia " + statie.getNume());
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

}
