package ChainSTB;

public class CalatorieAutobuz extends Handler{


    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 5)
            return "Autobuz";
        return super.getSuccesor().recomandaCalatorie(distanta);
    }
}
