package StrategySTB.clase;

public class CardBancar implements MetodaPlata{
    @Override
    public void plateste(String numeClient, double pret) {
        System.out.println("Clientul " + numeClient + " a platit cu card bancar suma de " + pret);

    }
}
