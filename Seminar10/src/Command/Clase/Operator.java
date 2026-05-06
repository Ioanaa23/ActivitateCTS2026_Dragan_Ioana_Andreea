package Command.Clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi = new ArrayList<>();

    public void inregistreaza(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(listaComenzi.size() > 0 ){
            listaComenzi.get(0).execute();
            listaComenzi.remove(0);
        }

    }
}
