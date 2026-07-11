package ProxySTB2.clase;

public class AutobuzNoapte implements MijlocDeTransport{
    private Autobuz autobuz;
    private int nrCalatori;

    public AutobuzNoapte(Autobuz autobuz, int nrCalatori) {
        this.autobuz = autobuz;
        this.nrCalatori = nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie(String statie) {
        if(this.nrCalatori > 0){
            autobuz.opresteInStatie(statie);
        }
        else
        {
            this.retrageLaAutobaza();
        }
    }

    @Override
    public void retrageLaAutobaza() {
        autobuz.retrageLaAutobaza();
    }
}
