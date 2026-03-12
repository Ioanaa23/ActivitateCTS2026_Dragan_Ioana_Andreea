package ro.ase.cts.simpleFactory.factory;

import ro.ase.cts.simpleFactory.factoryClasses.Autobuz;
import ro.ase.cts.simpleFactory.factoryClasses.MijlocTransport;
import ro.ase.cts.simpleFactory.factoryClasses.Tramvai;
import ro.ase.cts.simpleFactory.factoryClasses.Troleibuz;

public class FabricaMijloaceTransport {

    public MijlocTransport getMijlocTransport(Tipuri tip, int nrRoti, String nrInmatriculare){
        if(tip == Tipuri.AUTOBUZ) {
            return new Autobuz(nrRoti, nrInmatriculare);
        }
        if(tip == Tipuri.TRAMVAI) {
            return new Tramvai(nrRoti, nrInmatriculare);
        }
        if(tip == Tipuri.TROLEIBUZ) {
            return new Troleibuz(nrRoti, nrInmatriculare);
        }
        return null;
    }
}
