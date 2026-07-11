package ChainSTB;

public class CalatorieTramvai extends Handler{

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 10){
            return "Trammvai";
        }
        return super.getSuccesor().recomandaCalatorie(distanta);
    }
}
