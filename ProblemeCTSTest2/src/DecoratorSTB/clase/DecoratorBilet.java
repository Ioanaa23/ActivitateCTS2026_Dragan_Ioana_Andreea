package DecoratorSTB.clase;

public abstract class DecoratorBilet implements IRezultat{
    private IRezultat rezultat;

    public DecoratorBilet(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void printeaza() {
        this.rezultat.printeaza();
    }

    public abstract void printeazaCustomizat();
}
