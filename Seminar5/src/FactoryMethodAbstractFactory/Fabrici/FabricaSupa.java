package FactoryMethodAbstractFactory.Fabrici;

import FactoryMethodAbstractFactory.clase.FelMancare;
import FactoryMethodAbstractFactory.clase.Supa;
import FactoryMethodAbstractFactory.clase.SupaCiuperci;
import FactoryMethodAbstractFactory.clase.SupaLegume;
import FactoryMethodAbstractFactory.enums.TipMancare;
import FactoryMethodAbstractFactory.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare == TipSupa.LEGUME){
            return new SupaLegume(pret, gramaj);
        } else if (tipMancare == TipSupa.CIUPERCI) {
            return new SupaCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return getFelMancare(tipMancare, pret, gramaj);
    }
}
