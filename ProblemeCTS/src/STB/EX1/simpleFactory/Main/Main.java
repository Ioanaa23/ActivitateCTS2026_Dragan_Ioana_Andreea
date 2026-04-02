package STB.EX1.simpleFactory.Main;

import STB.EX1.simpleFactory.factory.FabricaMijloaceTransport;
import STB.EX1.simpleFactory.factory.Tipuri;
import STB.EX1.simpleFactory.factoryClasses.Autobuz;
import STB.EX1.simpleFactory.factoryClasses.MijlocTransport;
import STB.EX1.simpleFactory.factoryClasses.Tramvai;
import STB.EX1.simpleFactory.factoryClasses.Troleibuz;

public class Main {
    public static void main(String[] args) {
        MijlocTransport a1 = FabricaMijloaceTransport.getMijlocTransport(Tipuri.AUTOBUZ);
        a1.afiseazaDetalii();
        //FabricaMijloaceTransport fabrica = new FabricaMijloaceTransport();
        //MijlocTransport autobuz = fabrica.getMijlocTransport(Tipuri.AUTOBUZ);
        //autobuz.afiseazaDetalii();
    }
}
