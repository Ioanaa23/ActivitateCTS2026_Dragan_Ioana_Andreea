package Spital.EX3.FactoryMethod.factory;



import Spital.EX3.FactoryMethod.clase.PersonalSpital1;
import Spital.EX3.FactoryMethod.clase.Registrator;
import Spital.EX3.FactoryMethod.clase.Secretar;
import Spital.EX3.FactoryMethod.enums.TipPersonal;
import Spital.EX3.FactoryMethod.enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaAbstracta{


    @Override
    public PersonalSpital1 getPersonal(TipPersonal tip, String nume) {
        switch (tip){
            case TipPersonalNonMedical.REGISTRATOR: return new Registrator(nume);
            case TipPersonalNonMedical.SECRETAR: return new Secretar(nume);
            default: throw new IllegalArgumentException("NU MERGE");
        }
    }
}
