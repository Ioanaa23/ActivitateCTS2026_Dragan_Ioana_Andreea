package CompositeSTB.clase;

public class Autobuz implements Structura {
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Autobuz [Producator: " + producator +
                ", Model: " + model +
                ", Locuri: " + nrLocuri + "]");
    }
}
