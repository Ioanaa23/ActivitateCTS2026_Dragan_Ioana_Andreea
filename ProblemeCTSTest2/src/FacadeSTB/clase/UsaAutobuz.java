package FacadeSTB.clase;

public class UsaAutobuz {
    private String pozitie;

    public UsaAutobuz(String pozitie) {
        this.pozitie = pozitie;
    }

    public void activeazaModLiber(){
        System.out.println("Usa din " + pozitie + " este acum in modul liber");
    }

    public void deschideFortat(){
        System.out.println("Usa din " + pozitie + " a fost deschisa fortat");
    }
}
