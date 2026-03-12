package ro.ase.cts.simpleFactory.factoryClasses;

public class Tramvai extends MijlocTransport{
    public Tramvai(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Numar roti tramvai: ").append(super.nrRoti);
        builder.append(" Numar inmatriculare tramvai: ").append(super.nrInmatriculare);
        System.out.println(builder);
    }

}
