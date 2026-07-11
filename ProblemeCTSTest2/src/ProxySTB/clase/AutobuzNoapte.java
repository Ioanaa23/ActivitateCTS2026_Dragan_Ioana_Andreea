package ProxySTB.clase;

public class AutobuzNoapte implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(statie.getNrCalatori() > 0 || this.mijlocDeTransport.getNrPasageri() > 0){
            this.mijlocDeTransport.opresteInStatie(statie);
        }
        else
            System.out.println("Autobuzul isi continua drumul");
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }
}
