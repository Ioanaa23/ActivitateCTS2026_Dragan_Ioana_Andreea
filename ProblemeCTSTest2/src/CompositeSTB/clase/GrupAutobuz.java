package CompositeSTB.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuz implements Structura{
    private String tipGrup;
    private List<Structura> listaAutobuze;

    public GrupAutobuz(String tipGrup) {
        this.tipGrup = tipGrup;
        this.listaAutobuze = new ArrayList<>();
    }

    public void adaugaAutobuz(Structura structura){
        listaAutobuze.add(structura);
    }

    public void eliminaAutobuz(Structura structura){
        listaAutobuze.remove(structura);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("\n====" + tipGrup + " ====");
        for (Structura structura : listaAutobuze){
            structura.afiseazaDetalii();
        }
    }
}
