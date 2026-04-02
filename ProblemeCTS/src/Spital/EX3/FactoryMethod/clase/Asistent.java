package Spital.EX3.FactoryMethod.clase;

public class Asistent extends PersonalMedical{
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistent: ").append(super.toString());
        System.out.println(sb);
    }
}
