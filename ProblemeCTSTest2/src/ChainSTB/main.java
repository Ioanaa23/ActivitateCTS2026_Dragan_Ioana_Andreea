package ChainSTB;

public class main {
    public static void main(String[] args) {
        CalatorieTroleibuz calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieAutobuz calatorieAutobuz = new CalatorieAutobuz();
        CalatorieTramvai calatorieTramvai = new CalatorieTramvai();
        CalatorieMetrou calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(7));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(56));
    }
}
