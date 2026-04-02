package Spital.EX3.FactoryMethod.factory;

import Spital.EX3.FactoryMethod.clase.Brancardier;
import Spital.EX3.FactoryMethod.clase.Medic;
import Spital.EX3.FactoryMethod.clase.PersonalSpital1;
import Spital.EX3.FactoryMethod.clase.Asistent;
import Spital.EX3.FactoryMethod.enums.TipPersonal;
import Spital.EX3.FactoryMethod.enums.TipPersonalMedical;

public class FabricaPersonalMedical implements FabricaAbstracta{
    @Override
    public PersonalSpital1 getPersonal(TipPersonal tip, String nume) {
        switch (tip){
            case TipPersonalMedical.MEDIC: return new Medic(nume);
            case TipPersonalMedical.ASISTENT: return new Asistent(nume);
            case TipPersonalMedical.BRANCARDIER: return new Brancardier(nume);

            default:
                throw new IllegalStateException("Tipul " + tip + " introdus nu face parte din categoria personal medical " );
        }
    }
}
