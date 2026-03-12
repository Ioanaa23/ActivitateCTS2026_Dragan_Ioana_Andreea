package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.factory.FabricaMijloaceTransport;
import ro.ase.cts.simpleFactory.factory.Tipuri;
import ro.ase.cts.simpleFactory.factoryClasses.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        FabricaMijloaceTransport fabrica = new FabricaMijloaceTransport();
        MijlocTransport autobuz = fabrica.getMijlocTransport(Tipuri.AUTOBUZ, 6, "B23SEI" );
        MijlocTransport tramvai = fabrica.getMijlocTransport(Tipuri.TRAMVAI, 4, "DJ55KOP");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}
