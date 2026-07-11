package DecoratorSTB.clase;

public class BiletCustomizat extends DecoratorBilet{
    public BiletCustomizat(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void printeazaCustomizat() {
        System.out.println("La multi ani!");
    }
}
