package ChainSTB;

public class CalatorieTroleibuz extends Handler{


    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 3){
            return "Troleibuz";
        }
        return super.getSuccesor().recomandaCalatorie(distanta);
    }
}
