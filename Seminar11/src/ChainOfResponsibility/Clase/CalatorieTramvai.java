package ChainOfResponsibility.Clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 10 ){
            return "Tramvai";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
