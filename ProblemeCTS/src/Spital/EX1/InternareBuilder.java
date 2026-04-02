package Spital.EX1;

public class InternareBuilder implements AbstractBuilder{

    private String numePacient;
    private boolean pat;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public InternareBuilder(){
        super();
        this.numePacient = "";
        this.pat = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }

    @Override
    public Internare build() {
        return new Internare(numePacient, pat, micDejun, papuci, halat);
    }


    @Override
    public AbstractBuilder setNume(String nume) {
        this.numePacient =nume;
        return this;
    }

    @Override
    public AbstractBuilder setPat(boolean pat) {
        this.pat =pat;
        return this;    }

    @Override
    public AbstractBuilder setMicDejun(boolean micDejun) {
        this.micDejun =micDejun;
        return this;    }

    @Override
    public AbstractBuilder setPapuci(boolean papuci) {
        this.papuci =papuci;
        return this;    }

    @Override
    public AbstractBuilder setHalat(boolean halat) {
        this.halat =halat;
        return this;    }
}
