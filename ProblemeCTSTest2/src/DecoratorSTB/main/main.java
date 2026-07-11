package DecoratorSTB.main;

import DecoratorSTB.clase.Bilet;
import DecoratorSTB.clase.BiletCustomizat;
import DecoratorSTB.clase.DecoratorBilet;
import DecoratorSTB.clase.IRezultat;

public class main {
    public static void main(String[] args) {
        IRezultat bilet = new Bilet(10);

        bilet.printeaza();

        DecoratorBilet decoratorBilet = new BiletCustomizat(bilet);
        decoratorBilet.printeazaCustomizat();


    }
}
