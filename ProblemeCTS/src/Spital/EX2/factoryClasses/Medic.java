package Spital.EX2.factoryClasses;

public class Medic implements PersonalSpital{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul " + nume + " este pregatit pentru a consulta pacientii");
    }
}
