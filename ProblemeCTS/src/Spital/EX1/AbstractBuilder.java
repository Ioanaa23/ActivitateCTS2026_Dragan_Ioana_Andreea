package Spital.EX1;

public interface AbstractBuilder {
    Internare build();

    AbstractBuilder setNume(String nume);
    AbstractBuilder setPat(boolean pat);
    AbstractBuilder setMicDejun(boolean micDejun);
    AbstractBuilder setPapuci(boolean papuci);
    AbstractBuilder setHalat(boolean halat);

}
