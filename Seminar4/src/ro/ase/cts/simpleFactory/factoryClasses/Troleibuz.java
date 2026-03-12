package ro.ase.cts.simpleFactory.factoryClasses;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Numar roti troleibuz: ").append(super.nrRoti);
        builder.append(" Numar inmatriculare troleibuz: ").append(super.nrInmatriculare);
        System.out.println(builder);
    }
}
