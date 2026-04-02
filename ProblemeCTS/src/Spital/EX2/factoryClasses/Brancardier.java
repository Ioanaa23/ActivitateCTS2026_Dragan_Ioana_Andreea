package Spital.EX2.factoryClasses;

public class Brancardier implements PersonalSpital{
    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardierul " + nume + " este pregatit pntru a transporta pacientii");
    }
}
