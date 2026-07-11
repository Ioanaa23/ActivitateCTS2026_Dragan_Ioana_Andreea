package ObserverSTB;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements MijlocTransport{
    private List<Calator> listaCalatori = new ArrayList<>();

    @Override
    public void trimiteMesaj(String mesaj) {
        for( Calator calator : listaCalatori){
            calator.receptioneazaMesaj(mesaj);
        }
    }

    @Override
    public void aboneaza(Calator calator) {
        listaCalatori.add(calator);
    }

    @Override
    public void dezaboneaza(Calator calator) {
        listaCalatori.remove(calator);
    }
}
