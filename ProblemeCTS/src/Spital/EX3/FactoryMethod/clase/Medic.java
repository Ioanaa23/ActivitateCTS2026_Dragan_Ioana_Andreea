package Spital.EX3.FactoryMethod.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume) {
        super(nume);
    }



    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medic: ").append(super.toString());
        System.out.println(sb);
    }
}
