package Spital.EX3.FactoryMethod.clase;

import Spital.EX2.factoryClasses.PersonalSpital;

public abstract class PersonalMedical implements PersonalSpital1 {
    private String nume;

    public PersonalMedical(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
