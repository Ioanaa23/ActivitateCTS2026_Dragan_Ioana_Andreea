package FacadeSTB.clase;

public class PanouControlFacade {
    private UsaAutobuz usaFata;
    private UsaAutobuz usaMijloc;
    private UsaAutobuz usaSpate;

    public PanouControlFacade() {
        this.usaFata = new UsaAutobuz("Fata");
        this.usaMijloc = new UsaAutobuz("Mijloc");
        this.usaSpate = new UsaAutobuz("Spate");
    }

    public void elibereazaToateUsile(){
        System.out.println(">>> SOFERUL A APASAT: Eliberare toate usile <<<");
        usaFata.activeazaModLiber();
        usaMijloc.activeazaModLiber();
        usaSpate.activeazaModLiber();
    }

    public void deschideFortatToateUsile(){
        System.out.println(">>> SOFERUL A APASAT: Deschidere fortata toate usile <<<");
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
