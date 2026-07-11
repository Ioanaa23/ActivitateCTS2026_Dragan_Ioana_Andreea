package StrategySTB.clase;

public class SMS implements MetodaPlata{
    @Override
    public void plateste(String numeClient, double pret) {
        System.out.println("Clientul " + numeClient + " a platit prin SMS suma de " + pret);
    }
}
