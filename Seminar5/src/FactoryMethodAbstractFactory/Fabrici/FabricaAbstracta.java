package FactoryMethodAbstractFactory.Fabrici;

import FactoryMethodAbstractFactory.clase.FelMancare;
import FactoryMethodAbstractFactory.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
