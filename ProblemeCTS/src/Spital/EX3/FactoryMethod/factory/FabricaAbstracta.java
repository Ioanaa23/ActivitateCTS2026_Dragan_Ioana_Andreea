package Spital.EX3.FactoryMethod.factory;

import Spital.EX3.FactoryMethod.clase.PersonalSpital1;
import Spital.EX3.FactoryMethod.enums.TipPersonal;

public interface FabricaAbstracta {
    public PersonalSpital1 getPersonal(TipPersonal tip, String nume);
}
