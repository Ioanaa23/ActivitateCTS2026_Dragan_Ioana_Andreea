package DecoratorSTB.clase;

public class Bilet implements IRezultat{
    private int pret;

    public Bilet(int pret) {
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println("Biletul a fost achizitionat la pretul de " + this.pret);
    }
}
