package STB.EX2;

public class Autobuz implements IAutobuz {
    private int nrRoti;
    private String nrInmatriculare;
    private String firma;

    public Autobuz(){

    }

    public Autobuz(int nrRoti, String nrInmatriculare, String firma) {
        if(nrRoti < 4){
            throw new IllegalArgumentException("Autobuzul nu poate sa aibe mai putin de 4 roti");
        }
        else {
            this.nrRoti = nrRoti;
        }
        this.nrInmatriculare = nrInmatriculare;
        this.firma = firma;
    }

    @Override
    public IAutobuz clone() {
        Autobuz autobuzNou = new Autobuz();
        autobuzNou.nrRoti = this.nrRoti;
        autobuzNou.nrInmatriculare = this.nrInmatriculare;
        autobuzNou.firma = this.firma;
        return autobuzNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrRoti=").append(nrRoti);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", firma='").append(firma).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
