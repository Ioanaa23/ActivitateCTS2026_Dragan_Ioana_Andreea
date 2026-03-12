package ro.ase.cts.simpleFactory.factoryClasses;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Numar roti autobuz: ").append(super.nrRoti);
        builder.append(" Numar inmatriculare autobuz: ").append(super.nrInmatriculare);
        System.out.println(builder);
    }
}
