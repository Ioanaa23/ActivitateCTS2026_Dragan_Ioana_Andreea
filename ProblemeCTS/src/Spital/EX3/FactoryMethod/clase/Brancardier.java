package Spital.EX3.FactoryMethod.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brancardier: ").append(super.toString());
        System.out.println(sb);
    }
}
