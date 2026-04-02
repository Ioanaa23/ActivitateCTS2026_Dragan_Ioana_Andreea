package Spital.EX1;

public class Internare {
    private String numePacient;
    private boolean pat;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public Internare(){
        this.numePacient = "pacient";
        this.pat = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }

    public Internare(String numePacient, boolean pat, boolean micDejun, boolean papuci, boolean halat) {
        this.numePacient = numePacient;
        this.pat = pat;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPat(boolean pat) {
        this.pat = pat;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", pat=").append(pat);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}

