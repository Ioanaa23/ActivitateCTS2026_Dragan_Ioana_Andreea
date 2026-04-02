package Spital.EX3.FactoryMethod.clase;

public abstract class PersonalNonMedical implements PersonalSpital1 {
    private String nume;

    public PersonalNonMedical(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
