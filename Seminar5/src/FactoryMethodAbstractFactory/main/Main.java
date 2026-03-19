package FactoryMethodAbstractFactory.main;

import FactoryMethodAbstractFactory.Fabrici.FabricaDesert;
import FactoryMethodAbstractFactory.Fabrici.FabricaSupa;
import FactoryMethodAbstractFactory.clase.FelMancare;
import FactoryMethodAbstractFactory.clase.SupaCiuperci;
import FactoryMethodAbstractFactory.enums.TipDesert;
import FactoryMethodAbstractFactory.enums.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15, 100);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 15, 101);

        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 20, 200);
        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 25, 201);

        supaCiuperci.afisare();
        supaLegume.afisare();
        papanasi.afisare();
        clatite.afisare();
    }
}
