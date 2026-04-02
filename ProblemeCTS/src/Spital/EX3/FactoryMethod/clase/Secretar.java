package Spital.EX3.FactoryMethod.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Secretar: ").append(super.toString());
        System.out.println(sb);
    }
}
