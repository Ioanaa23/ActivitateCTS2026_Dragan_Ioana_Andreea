package STB.EX1.simpleFactory.factory;

import STB.EX1.simpleFactory.factoryClasses.Autobuz;
import STB.EX1.simpleFactory.factoryClasses.MijlocTransport;
import STB.EX1.simpleFactory.factoryClasses.Tramvai;
import STB.EX1.simpleFactory.factoryClasses.Troleibuz;

public class FabricaMijloaceTransport {
    public static MijlocTransport getMijlocTransport(Tipuri tip){
        switch (tip){
            case AUTOBUZ: return new Autobuz();
            case TRAMVAI: return new Tramvai();
            case TROLEIBUZ: return new Troleibuz();
            default: throw new MijlocException(" EXCEPTIE");
        }
    }
}
