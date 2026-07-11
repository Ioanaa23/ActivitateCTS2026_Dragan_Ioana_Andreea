package FlyweiightSTB2.clase;

public class Linie implements IAutobuz{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    @Override
    public void descriere(Autobuz autobuz) {
        System.out.println("Autobuzul de pe linia " + this.nrLinie + " circula intre statiile " + this.primaStatie + " si " + this.ultimaStatie
        + " Descriere autobuz " + autobuz.toString());
    }
}
