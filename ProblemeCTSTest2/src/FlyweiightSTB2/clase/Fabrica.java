package FlyweiightSTB2.clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<Integer, Linie> map = new HashMap<>();

    public Linie getLinie(int nrLinie, String primaStatie, String ultimaStatie){
        if(map.containsKey(nrLinie)){
            return map.get(nrLinie);
        }
        else
        {
            map.put(nrLinie, new Linie(nrLinie, primaStatie, ultimaStatie));
            return map.get(nrLinie);
        }
    }
}
