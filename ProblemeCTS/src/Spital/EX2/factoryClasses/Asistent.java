package Spital.EX2.factoryClasses;

public class Asistent implements PersonalSpital{
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistentul " + nume + " este pregatit pentru a administra tratamentul");
    }
}
