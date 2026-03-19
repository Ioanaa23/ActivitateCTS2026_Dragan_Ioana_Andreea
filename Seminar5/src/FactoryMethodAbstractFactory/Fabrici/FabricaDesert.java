package FactoryMethodAbstractFactory.Fabrici;

import FactoryMethodAbstractFactory.clase.Clatite;
import FactoryMethodAbstractFactory.clase.FelMancare;
import FactoryMethodAbstractFactory.clase.Papanasi;
import FactoryMethodAbstractFactory.enums.TipDesert;
import FactoryMethodAbstractFactory.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj){
        return getFelMancare(tipMancare, pret, gramaj, 0);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if(tipMancare == TipDesert.PAPANASI){
            return new Papanasi(pret, gramaj, calorii);
        } else if (tipMancare == TipDesert.CLATITE) {
            return new Clatite(pret, gramaj, calorii);
        }
        return null;
    }
}
