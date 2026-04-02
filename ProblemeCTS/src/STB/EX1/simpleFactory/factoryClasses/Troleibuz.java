package STB.EX1.simpleFactory.factoryClasses;

import STB.EX1.simpleFactory.factory.Tipuri;

public class Troleibuz implements MijlocTransport{

    @Override
    public void afiseazaDetalii() {
        System.out.println("Mijlocul de trasnport este: " + Tipuri.TROLEIBUZ);
    }
}
