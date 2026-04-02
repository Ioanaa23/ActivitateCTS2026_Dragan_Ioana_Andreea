package AgentieTurism.singleton;

public class AgeTur {
    private String numePachet;
    private int pret;
    private int nrPachete;
    private int nrPacheteRezervate;

    private static AgeTur instance = null;

    private AgeTur(String numePachet, int pret, int nrPachete, int nrPacheteRezervate) {
        this.numePachet = numePachet;
        this.pret = pret;
        this.nrPachete = nrPachete;
        this.nrPacheteRezervate = nrPacheteRezervate;
    }

    public static synchronized AgeTur getInstance(String numePachet, int pret, int nrPachete, int nrPacheteRezervate){
        if(instance == null){
            instance = new AgeTur(numePachet, pret, nrPachete, nrPacheteRezervate);
        }
        return instance;
    }

    public void rezervaPachet(){
        if(this.nrPachete > this.nrPacheteRezervate){
            System.out.println("Rezervarea a fost efectuata");
        }
        else{
            System.out.println("Nu mai sunt pachete disponibile!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgeTur{");
        sb.append("numePachet='").append(numePachet).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
