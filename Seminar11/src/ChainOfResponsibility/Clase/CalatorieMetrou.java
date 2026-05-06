package ChainOfResponsibility.Clase;

public class CalatorieMetrou extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        return "Metrou";
    }
}
