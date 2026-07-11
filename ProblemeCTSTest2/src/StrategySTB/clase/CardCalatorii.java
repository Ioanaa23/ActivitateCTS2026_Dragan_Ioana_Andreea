package StrategySTB.clase;

public class CardCalatorii implements MetodaPlata{
    @Override
    public void plateste(String numeClient, double pret) {
        System.out.println("Clientul " + numeClient + " a platit cu card de calatorii suma de " + pret);

    }
}
