package Spital.EX3.FactoryMethod.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registrator: ").append(super.toString());
        System.out.println(sb);    }
}
