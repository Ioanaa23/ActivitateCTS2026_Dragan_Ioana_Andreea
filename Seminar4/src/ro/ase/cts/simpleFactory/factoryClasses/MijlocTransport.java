package ro.ase.cts.simpleFactory.factoryClasses;

public abstract class MijlocTransport {

    protected int nrRoti;
    protected String nrInmatriculare;

    public MijlocTransport(int nrRoti, String nrInmatriculare) {
        this.nrRoti = nrRoti;
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afiseazaDescriere();
}
